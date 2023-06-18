package cfex;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListSix {

	public static void main(String[] args) {
		LinkedList<String> enames=new LinkedList<String>();
		
		enames.add("Manisha");//0
		enames.add("Swetha"); //1
		
		enames.add("Rahul");//2
		enames.add("Sumanth");//3
		enames.add("Narasimha");//4
		
		enames.addFirst("Rajnikanth");
		enames.addLast("Nayana");
		System.out.println(enames);
	}

}
