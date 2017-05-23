package boot;

import java.util.ArrayList;

import searchLib.BFS;
import searchLib.MySearchable;
import searchLib.Position;
import searchLib.Searchable;
import searchLib.Searcher;
import stripLib.Action;

public class Main {

	public static void main(String[] args) {
		// for the State<T> class, T = Position which includes x,y for this example
		// or new Dijkstra<>();
		Searcher<Position> searcher=new BFS<Position>();
		// or any Searchable
		Searchable<Position> searchable=new MySearchable<Position>();
		ArrayList<Action> actions = searcher.search(searchable);
		// see the actions
		for(Action a : actions)
		System.out.println(a);
		System.out.println("# of nodes evaluated " + searcher.getNumberOfNodesEvaluated());

	}

}
