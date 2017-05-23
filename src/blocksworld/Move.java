package blocksworld;

import java.util.ArrayList;
import java.util.List;

import stripLib.Action;
import stripLib.Predicate;

public class Move extends Action {

	public Move() {		
		name = "Move";	
		args = new String[]{"b", "x", "y"};
		preconditions.add(new Predicate("On", "b", "x"));
		preconditions.add(new Predicate("Clear", "b"));
		preconditions.add(new Predicate("Clear", "y"));
		addList.add(new Predicate("On", "b", "y"));
		addList.add(new Predicate("Clear", "x"));
		deleteList.add(new Predicate("On", "b", "x"));
		deleteList.add(new Predicate("Clear", "y"));
		
		List<String> values = new ArrayList<String>();
		values.add("Table");
		illegalAssignments.put("b", values);	
	}

}
