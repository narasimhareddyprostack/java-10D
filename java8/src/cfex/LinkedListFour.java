package cfex;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListFour {

	public static void main(String[] args) {
		LinkedList<String> enames=new LinkedList<String>();
		enames.add("Manisha");
		enames.add("Swetha");
		
		enames.add("Rahul");
		enames.add("Sumanth");
		enames.add("Narasimha");
		//enames.add(null);
		
		System.out.println(enames);
		
		Collections.sort(enames);
		
		System.out.println(enames);
	}

}
