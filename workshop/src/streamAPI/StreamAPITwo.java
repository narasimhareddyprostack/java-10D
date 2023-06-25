package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPITwo {

	public static void main(String[] args) {
		ArrayList<Integer> nums=new ArrayList<Integer>();
		nums.add(10);
		nums.add(1);
		nums.add(105);
		nums.add(26);
		nums.add(37);
		nums.add(49);
		//print all even numbers 
		//print all odd numbers
		List evens = nums.stream()
		    .filter(num -> num%2 ==0)
		    .collect(Collectors.toList());
		
		System.out.println(evens);
		List odds =nums.stream()
		    .filter(num -> num %2 !=0)
			.collect(Collectors.toList()); 
		System.out.println(odds);
;	}

}