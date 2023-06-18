package cfex;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListFive {

	public static void main(String[] args) {
		LinkedList<String> enames=new LinkedList<String>();
		enames.add("Manisha");//0
		enames.add("Swetha"); //1
		enames.add("Swetha");//2
		enames.add("Swetha");//3
		enames.add("Rahul");//4
		enames.add("Sumanth");//5
		enames.add("Narasimha");//6
		
		//enames.remove("Swetha");
		enames.remove(5);
		System.out.println(enames);
	}

}
