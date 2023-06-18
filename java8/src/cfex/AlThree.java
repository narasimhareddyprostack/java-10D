package cfex;

import java.util.ArrayList;
import java.util.Collections;

public class AlThree {

	public static void main(String[] args) {
	ArrayList<String> enames=new ArrayList<String>();
	
	enames.add("Rahul");
	enames.add("Sumanth");
	enames.add("Swetha");
	enames.add("Mannisha");
	enames.add("Narasimha");
	System.out.println(enames);
	Collections.sort(enames,Collections.reverseOrder());
	System.out.println(enames);
	}

}
