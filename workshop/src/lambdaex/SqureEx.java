package lambdaex;

interface SqureI{
	public int squreIt(int i);
}

public class SqureEx implements SqureI {

	public int squreIt(int i) {
	
		return i*i;
	}

	public static void main(String[] args) {
		SqureEx obj=new SqureEx();
		System.out.println(obj.squreIt(4));
	}

	
}
