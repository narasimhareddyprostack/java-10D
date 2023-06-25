package lambdaex;

interface SqureIOne{
	public abstract int apply(int i);
}
public class SqureExWithout implements SqureIOne {
	public  int apply(int i) {
		return i*i;
	}
	public static void main(String[] args) {
		SqureIOne	obj=new SqureExWithout();
		System.out.println(obj.apply(50));
	}

}
