package cfex;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedListOne {

	public static void main(String[] args) {
		LinkedList ids=new LinkedList();
		ids.add(101);
		ids.add(102);
		ids.add(103);
		ids.add(104);
		ids.add(105);
		ids.add(106);
		
		for(Object id:ids) {
			System.out.println(id);
		}
	}

}
