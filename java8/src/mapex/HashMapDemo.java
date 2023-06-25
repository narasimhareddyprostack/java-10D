package mapex;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<Integer,String> hm= new HashMap<Integer, String>();
		System.out.println(hm);
		//add key:value pair
		hm.put(101, "Manisha");
		hm.put(102, "Swetha");
		hm.put(103, "Sumanth");
		hm.put(104, "Rahul");
		hm.put(105, "Narasimha");
		System.out.println(hm);
		//print all keys
		Set keys=hm.keySet();
		System.out.println(keys);
		for(Object key:keys) {
			System.out.println(key);
		}
		//print all values
		//verify key exists or not 
		//verify value exists or not
		
	}

}
