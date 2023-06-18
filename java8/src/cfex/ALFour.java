package cfex;

import java.util.ArrayList;
import java.util.Iterator;

public class ALFour {
	public static void main(String[] args) {
		ArrayList<String> enames=new ArrayList<String>();
		enames.add("Manisha");
		enames.add("Swetha");
		enames.add("Rahul");
		enames.add("Sumanth");
		enames.add("Narasimha");
		
		Iterator itr=enames.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}
