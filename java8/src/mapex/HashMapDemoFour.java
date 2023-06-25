package mapex;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemoFour {

	public static void main(String[] args) {
		Map<Integer,String> empMap= new HashMap<Integer, String>();
		//System.out.println(empMap);
		//System.out.println(empMap.isEmpty());
		
		//add key:value pair
		empMap.put(101, "Manisha");
		empMap.put(102, "Swetha");
		empMap.put(103, "Sumanth");
		empMap.put(104, "Rahul");
		empMap.put(105, "Narasimha");
		System.out.println(empMap);
		
		Set<Map.Entry<Integer, String>> kvs = empMap.entrySet();
		//System.out.println(kvs);
		for(Map.Entry<Integer, String> kv: kvs) {
				System.out.println("Employee Id:"+kv.getKey() +" and Employee Name:"+ kv.getValue());
		}
	}

}
