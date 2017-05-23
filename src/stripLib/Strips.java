package stripLib;

import java.util.List;
import java.util.Stack;

import stripLib.Action;
import stripLib.Goal;
import stripLib.Plannable;
import stripLib.Predicate;
import stripLib.State;

public class Strips extends CommonPlanner {

	@Override
	public Plan computePlan(Plannable plannable, HeuristicMethods h) {
		Stack<Object> stack = new Stack<Object>();
		
		stack.push(plannable.getGoalState());
		State currState = plannable.getInitialState();
		List<Action> actions = plannable.getAllActions();
		
		while (!stack.isEmpty()) {
			Object obj = stack.pop();
			
			if (obj instanceof Goal) {
				handleComplexGoal(h, stack, obj);
			}
			else if (obj instanceof Predicate) {
				Predicate p = (Predicate)obj;
				if (!isSatisfied(p, currState)) {
					Action a = getSatisfyingAction(p, actions);
				}	
			}
			else if (obj instanceof Action) {
				
			}
			else {
				throw new IllegalArgumentException("Invalid object in stack");
			}
		}
		
		return null;
	}

	private void handleComplexGoal(HeuristicMethods h, Stack<Object> stack, Object obj) {
		Goal g = (Goal)obj;
		List<Predicate> predicates;
		if (h != null) 
			predicates = h.decomposeGoal(g);
		else
			predicates = g.getPredicates();
		for (Predicate p : predicates) {
			stack.push(p);
		}
	}
	
	

}
