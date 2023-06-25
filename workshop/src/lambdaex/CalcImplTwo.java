package lambdaex;

interface CalcTwo{
	
	public abstract int sum(int a, int b);
}
public class CalcImplTwo {
	
	public static void main(String[] args) {
		CalcTwo obj=(a,b)->a+b;
		System.out.println(obj.sum(10, 20));

	}

}
