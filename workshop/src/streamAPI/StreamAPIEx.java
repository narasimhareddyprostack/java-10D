package streamAPI;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamAPIEx {

	public static void main(String[] args) {
		Stream s1 = Stream.of(10,20,30,40,50);
		//System.out.println(s1);
		//System.out.println(Arrays.asList(s1));
		for(Object list:Arrays.asList(s1)) {
				System.out.println(list);
		}
	}

}
