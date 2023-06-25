package lambdaex;

interface SqureInterface{
		int apply(int a);
}

public class SqureExTwo {

	static SqureInterface obj  = i->i*i;
	
	public static void main(String[] args) {
		System.out.println(obj.apply(4));

	}

}
