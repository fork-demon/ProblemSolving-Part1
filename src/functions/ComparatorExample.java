package functions;

import java.util.function.BinaryOperator;
import java.util.function.Function;

public class ComparatorExample {
	
	public static void main(String[] args) {
		
		Comparator<Person> compAge = (p1,p2) -> p1.getAge() - p2.getAge();
		
		Comparator<Person> compFirstname = (p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName());
		Comparator<Person> lastName = (p1, p2) -> p1.getLastName().compareTo(p2.getLastName());
		
		//Function<Person, Integer> f1 = p-> p.getAge();
		Function<Person, String> f2 = p-> p.getFirstName();
		Function<Person, String> f13 = p-> p.getLastName();
		
		Comparator<Person> comage = Comparator.comparing(Person::getAge).thenComparing(Person:: getFirstName);
	}

}
