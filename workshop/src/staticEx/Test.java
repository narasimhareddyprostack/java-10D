package staticEx;

interface TestInterface{
		static	void m1(){
		System.out.println("static method");
		}
}
public class Test {

	public static void main(String[] args) {
		TestInterface.m1();

	}

}
