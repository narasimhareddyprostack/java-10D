package cfex;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedListTwo {

	public static void main(String[] args) {
		LinkedList<Integer> ids=new LinkedList<Integer>();
		ids.add(101);
		ids.add(102);
		ids.add(103);
		ids.add(104);
		ids.add(105);
		ids.add(106);
		
		for(int id:ids) {
			System.out.println(id);
		}
	}

}
