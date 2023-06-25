package mapex;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class HashMapDemoTwo {

	public static void main(String[] args) {
		Map<Integer,String> empMap= new HashMap<Integer, String>();
		System.out.println(empMap);
		//add key:value pair
		empMap.put(101, "Manisha");
		empMap.put(102, "Swetha");
		empMap.put(103, "Sumanth");
		empMap.put(104, "Rahul");
		empMap.put(105, "Narasimha");
		System.out.println(empMap);
		//print employee name from empMap object
		Collection enames=empMap.values();
		for(Object ename:enames) {
			System.out.println(ename);
		}
		
		
	}

}
