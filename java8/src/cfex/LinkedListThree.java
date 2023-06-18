package cfex;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListThree {

	public static void main(String[] args) {
		LinkedList<String> enames=new LinkedList<String>();
		enames.add("Manisha");
		enames.add("Swetha");
		enames.add("Rahul");
		enames.add("Sumanth");
		enames.add("Narasimha");
		
		int i=0;
		while(i<=enames.size()-1) {
			System.out.println(enames.get(i));
			i++;
		}
		/*
		Iterator itr= enames.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		*/
	}

}
