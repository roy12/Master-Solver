package stripLib;
import java.util.HashSet;
import java.util.Set;

public class State {
	private Set<Predicate> predicates = new HashSet<Predicate>();

	public Set<Predicate> getPredicates() {
		return predicates;
	}	
	
}
