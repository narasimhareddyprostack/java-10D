package predefinedFI;

import java.util.function.Predicate;

public class PredicateExOne {

	public static void main(String[] args) {
		Predicate<Integer> t =(a)->{ 
			if(a>500) {
				return true;
			}
			else {
				return false;
			}
			
		};
		System.out.println(t.test(501));

	}

}
