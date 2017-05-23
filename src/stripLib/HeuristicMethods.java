package stripLib;

import java.util.List;

import stripLib.Goal;
import stripLib.Predicate;

public interface HeuristicMethods {
	List<Predicate> decomposeGoal(Goal g);
}
