package stripLib;

import stripLib.Plannable;

public interface Planner {
	Plan computePlan(Plannable plannable, HeuristicMethods h);
}
