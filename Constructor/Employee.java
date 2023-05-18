class Employee{
    int eId;
    String eName;

    Employee(int a, String b){
        this.eId = a;
        this.eName =b;
        System.out.println("Constructor method");
    }
    void getEmployee(){
        System.out.println("getEmploye method");
    }
    public static void main(String[] args) {
        Employee e1=new Employee(101,"Sumanth");
        System.out.println(e1.eId);
        System.out.println(e1.eName);
        
    }
}