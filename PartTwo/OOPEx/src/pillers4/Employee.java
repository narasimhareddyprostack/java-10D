package pillers4;

public class Employee {
	private int empId;//data hiding or abstraction
	//+
	public int getEmpId(){
		return empId;
	}
	public void setEmpId(int id){
		this.empId = id;
	}
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.setEmpId(101);
		int id =e1.getEmpId();
		System.out.println(id);
	}
	
	
	
}
