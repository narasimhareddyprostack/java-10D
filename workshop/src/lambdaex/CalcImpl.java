package lambdaex;

@FunctionalInterface	
interface Calc{
	public abstract int sum(int a, int b);
}

public class CalcImpl implements Calc{
	
	@Override
	public int sum(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	public static void main(String[] args) {
		Calc obj=new CalcImpl();
		
		
		int sumValue = obj.sum(10, 20);
		System.out.println(sumValue);
	}

	
}
