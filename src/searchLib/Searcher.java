package searchLib;

import java.util.ArrayList;

import stripLib.Action;

public interface Searcher <T> {
	
	public int getNumberOfNodesEvaluated();
	public ArrayList<Action> search(Searchable s);

}
