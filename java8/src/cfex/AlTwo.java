package cfex;

import java.util.ArrayList;
import java.util.Collections;

public class AlTwo {

	public static void main(String[] args) {
	ArrayList<Integer> al1=new ArrayList<Integer>();
	
	
	
	al1.add(745);
	al1.add(145);
	al1.add(545);
	al1.add(45);
	al1.add(245);
	System.out.println(al1);
	Collections.sort(al1,Collections.reverseOrder());
	System.out.println(al1);
	}

}
