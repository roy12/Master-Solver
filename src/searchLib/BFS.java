package searchLib;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * basic breadth first search in java
 */
public class BFS <T> implements Searcher {

	public Solution search(Searchable s) {
		addToOpenList(s.getInitialState());
		HashSet<State> closedSet=new HashSet<State>();
		while(openList.size()>0){
		State n=popOpenList();// dequeue
		closedSet.add(n);
		if(n.equals(s.getGoalState()))
		return backTrace(s.getGoalState(), s.getStartState());
		// private method, back traces through the parents
		ArrayList<State> successors=s.getAllPossibleStates(n) //however it is implemented
		for(State state : successors){
		if(!closedSet.contains(state) && ! openListContains(state)){
		state.setCameFrom(n);
		addToOpenList(state);
		} else{    }



}

	@Override
	public int getNumberOfNodesEvaluated() {
		// TODO Auto-generated method stub
		return 0;
	}
}