import java.util.Comparator;
import java.util.function.BinaryOperator;

public class Lamda {
	
	public static void main(String[] args) {
		
		Comparator<String> comparator = new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
				return Integer.compare(o1.length(), o2.length());
			}
		};
		
		Comparator<String> comp = ( s1,  s2) ->
		   Integer.compare(s1.length(), s2.length());
		   
		   Runnable r = ()-> {
			   
			   int i =0;
			   while(true){
				   
			   }
		   };
		   
		   BinaryOperator<Integer> sum = Integer::sum;
		   System.out.println(sum.apply(1, 2));
	
	}

}
