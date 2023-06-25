package mapex;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class HashMapDemoThree {

	public static void main(String[] args) {
		Map<Integer,String> empMap= new HashMap<Integer, String>();
		System.out.println(empMap);
		System.out.println(empMap.isEmpty());
		
		//add key:value pair
		empMap.put(101, "Manisha");
		empMap.put(102, "Swetha");
		empMap.put(103, "Sumanth");
		empMap.put(104, "Rahul");
		empMap.put(105, "Narasimha");
		System.out.println(empMap);
		//verify key exists or not - containskey
		System.out.println(empMap.containsKey(106));
		//verify given HashMap object empty or not
		System.out.println(empMap.isEmpty());
		
	}

}
