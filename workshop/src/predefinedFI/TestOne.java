package predefinedFI;

interface TestI{
		  boolean test(int a);
}
public class TestOne {

	public static void main(String[] args) {
		TestI  t = (int a )->{  return a>500; };
		System.out.println(t.test(40));
		

	}

}
