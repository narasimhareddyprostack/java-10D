package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmpNamesExTwo {
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
		enames.stream() 
		      .map(name->name.toUpperCase())
		      .forEach(name->System.out.println(name));
		
	}
}
