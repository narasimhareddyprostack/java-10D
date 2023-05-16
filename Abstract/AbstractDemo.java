abstract class Bank{
    abstract void cal_Bal();
}

class Account extends Bank{
    void cal_Bal(){ 
        System.out.println("cal Bal method in class= Account");
    }
}
public class AbstractDemo{
    public static void main(String[] args) {
        Account obj=new Account();
        obj.cal_Bal();
        final int x=100;
        x++;
    }
}