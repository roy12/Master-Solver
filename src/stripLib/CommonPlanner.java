package stripLib;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import stripLib.Action;
import stripLib.Predicate;
import stripLib.State;

public abstract class CommonPlanner implements Planner {
	protected boolean isSatisfied(Predicate p, State state) {
		return state.getPredicates().contains(p);
	}
	
	protected Action getSatisfyingAction(Predicate p, List<Action> actions) {
		for (Action action : actions) {
			for (Predicate addP : action.getAddList()) {
				if (p.getName().equals(addP.getName()) && p.getArgs().length == addP.getArgs().length) {
					Map<String, Object> assignment = findAssignment(p, addP, action);
					if (assignment != null)	{
						Action newAction = action.instantiate(assignment);
						return newAction;
					}
				}
			}
		}
		return null;
	}
	
	protected Map<String, Object> findAssignment(Predicate p, Predicate genericP, Action action) {
		Map<String, Object> assignment = new HashMap<String, Object>();
		
		String[] args1 = p.getArgs();
		String[] args2 = genericP.getArgs();
		Map<String, List<String>> illegalAssignments = action.getIllegalAssignments();
		
		for (int i = 0; i < args2.length; i++) {
			if (illegalAssignments.get(args2[i]).contains(args1[i]))
				return null;
			assignment.put(args2[i], args1[i]);
		}
		
		
		return assignment;
	}
}
