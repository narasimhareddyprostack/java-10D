package setEx;

import java.util.HashSet;

public class HashSetOne {

	public static void main(String[] args) {
	HashSet<String> enames	=new HashSet<String>();
	enames.add("Rahul");
	enames.add("Rahul");
	enames.add("Sonia");
	enames.add("Sonia");
	enames.add("Rahul");
	enames.add("Priyanka");
	enames.add(null);
	
	System.out.println(enames);
	
	for(String ename:enames) {
			System.out.println(ename);
	}

	}

}
