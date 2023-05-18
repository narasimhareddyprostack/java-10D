class Employee{
    Employee(){
        System.out.println("Constructor method");
    }
    void getEmployee(){
        System.out.println("getEmploye method");
    }
    public static void main(String[] args) {
        new Employee();
        new Employee();
        new Employee();
    }
}