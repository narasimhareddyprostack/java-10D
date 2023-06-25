package lambdaex;

interface CalcOne{
	
	public abstract int sum(int a, int b);
}
public class CalcImplOne {
	
	public static void main(String[] args) {
		CalcOne obj=(int a, int b)->{ 
							 return a+b;
							 };
				System.out.println(obj.sum(10, 20));

	}

}
