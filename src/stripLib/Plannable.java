package stripLib;

import java.util.List;

public interface Plannable {
	State getGoalState();
	State getInitialState();
	List<Action> getAllActions();
	
	
}
