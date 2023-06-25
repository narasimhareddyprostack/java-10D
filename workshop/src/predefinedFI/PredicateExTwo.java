package predefinedFI;

import java.util.function.Predicate;

public class PredicateExTwo {

	public static void main(String[] args) {
		Predicate<Integer> t  = i -> i>500; 
		System.out.println(t.test(50));

	}

}
