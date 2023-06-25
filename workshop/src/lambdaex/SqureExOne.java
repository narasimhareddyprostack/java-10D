package lambdaex;

import java.util.function.Function;

public class SqureExOne {

	static Function<Integer, Integer> obj = i -> i*i;

	public static void main(String[] args) {
		System.out.println(obj.apply(4));

	}

}
