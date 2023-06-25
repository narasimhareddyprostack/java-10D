package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmpNamesEx {
	public static void main(String[] args) {
		ArrayList<String> enames =new ArrayList<String>();
		enames.add("Malli");
		enames.add("Vignesh");
		enames.add("Sumanth");
		enames.add("Swetha");
		enames.add("Naveen");
		enames.add("Nagaraj");
		enames.add("Rahul");
		enames.add("Sonai");
		enames.add("Priyanka");
		/*
		List names = enames.stream()
				.filter(name -> name.startsWith("S"))
				.collect(Collectors.toList());
		System.out.println(names);
		*/
		enames.stream()
		.filter(ename -> ename.startsWith("S"))
		.forEach(name->System.out.println(name));
		
		
		
	}
}
