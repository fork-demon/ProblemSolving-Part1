package functions;

import java.util.function.Function;

@FunctionalInterface
public interface Comparator<T> {

	public int compare(T obj1, T obj2);
	
	@SuppressWarnings("unchecked")
	public static<U>  Comparator<U> comparing(@SuppressWarnings("rawtypes") Function<U, Comparable> f){
		return (p1,p2) -> f.apply(p1).compareTo(f.apply(p2));
	}
	
	public default Comparator<T> thenComparing(Comparator<T> com){
		
		return (p1,p2) -> compare(p1, p2) ==0 ? com.compare(p1, p2):compare(p1, p2);
		
	}

	
	public default Comparator<T> thenComparing(Function<T, Comparable> f){
	
		return thenComparing(comparing(f));
		
	}
}
