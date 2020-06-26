package delta;

import org.javers.core.diff.*;

import de.danielbechler.diff.node.*;

public class DeltaApplier {
	public static <T> T applyDelta(T baseObject, Diff delta) {
		
		for(Change change : delta.getChanges()) {
			System.out.println("Change: " + change);
		}
		return baseObject;
	}

	public static <T> T applyDelta(T baseObject, DiffNode delta) {
		System.out.println("  /------------------/");
		System.out.println(" / java-object-diff /");
		System.out.println("/------------------/");
		delta.visit(new DiffNode.Visitor()
		{
			public void node(DiffNode node, Visit visit)
			{
				final Object baseValue = node.canonicalGet(baseObject);
				String newValueString = "unknown";
				final String message
					= node.getPath()
					+ " changed from "
					+ baseValue
					+ " to "
					+ newValueString ;
				System.out.println(message);
			}
		});
		return baseObject;
	}
	
}
