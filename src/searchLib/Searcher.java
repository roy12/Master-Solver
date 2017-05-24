package searchLib;

import java.util.ArrayList;

import stripLib.Action;


public interface Searcher<T> {
	Solution search(Searchable<T> s);
	int getNumberOfNodesEvaluated();
}

