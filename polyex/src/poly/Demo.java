package poly;

public class Demo {
	public static void main(String[] args) {
		SA a1 = new SA();
		
		a1.setAcc_Id(101);
		a1.setAcc_Name("Rahul Gandhi");
		a1.setAcc_Amount(5000.00);
		a1.setMin_Bal(500.00);
		
		//a1.cal_Bal();
		AccountService.acc_Details(a1);
		CA a2=new CA();
		a2.setAcc_Id(102);
		a2.setAcc_Name("Priyanka");
		a2.setAcc_Amount(45000.00);
		a2.setMin_Bal(9000);
		
		//a2.cal_Bal();
		AccountService.acc_Details(a2);
		
	}
}
