package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIThree {

	public static void main(String[] args) {
		ArrayList<Integer> nums=new ArrayList<Integer>();
		nums.add(10);
		nums.add(1);
		nums.add(105);
		nums.add(26);
		nums.add(37);
		nums.add(49);
		//print all even numbers 
		List evens = new ArrayList();
		List odds = new ArrayList();
		for(int num : nums) {
			if(num % 2==0) {
				evens.add(num);
			}
			else {
				odds.add(num);
			}
		}
		System.out.println(evens);
		System.out.println(oddsenames);
}

}