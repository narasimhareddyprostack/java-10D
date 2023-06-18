package setEx;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTwo {

	public static void main(String[] args) {
	HashSet<String> enames=new HashSet<String>();
	enames.add("Rahul");
	enames.add("Rahul");
	enames.add("Sonia");
	enames.add("Sonia");
	enames.add("Rahul");
	enames.add("Priyanka");
	enames.add(null);
	System.out.println(enames);

	}

}
