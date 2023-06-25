package predefinedFI;

interface TestI{
	boolean test(int a);
}
public class TestImpl implements TestI {
	@Override
	public boolean test(int a) {
		
		return a>500;
	}
	public static void main(String[] args) {
			TestI t = new TestImpl();
			System.out.println(t.test(560));
	}

	

}
