package boot;

import java.util.HashMap;

import searchLib.Position;
import searchLib.Searchable;
import searchLib.State;
import stripLib.Action;

public class MySearchable<T> implements Searchable<Position> {

	@Override
	public State<Position> getInitialState() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public State<Position> getGoalState() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HashMap<Action, State<Position>> getAllPossibleMoves(State<Position> state) {
		// TODO Auto-generated method stub
		return null;
	}

}
