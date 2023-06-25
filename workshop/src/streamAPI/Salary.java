package streamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Salary {

	public static void main(String[] args) {
		ArrayList<Integer> salary =new ArrayList<Integer>();
		Stream salary1 = Stream.of(45000, 25000, 35000,20000, 780000);
		salary.add(45000);
		salary.add(5000);
		salary.add(95000);
		salary.add(4000);
		Collections.sort(salary); //NSO
		System.out.println(salary.get(0));
		
	}

}
