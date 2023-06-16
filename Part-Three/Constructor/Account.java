class Account{
    int acc_Id;
    String acc_Name;
    int acc_Amount;
    Account(int id, String name, int amount){
        this.acc_Id = id ;
        this.acc_Name = name;
        this.acc_Amount =amount;
        System.out.println("Account Class - const");
    } 
    void open_Account(){}
    void deposit_Amount(int amount){
        this.acc_Amount  = this.acc_Amount + amount;
    }
    int get_Bal(){
        return this.acc_Amount;
    }
    void withdrawl_Amount(int amount){
        this.acc_Amount = this.acc_Amount - amount;
    }
}
class Test{
    public static void main(String[] args) {
       Account a1 =new Account(101,"Rahul", 5000);
       Account a2 =new Account(102,"Priyanka", 45000);

       System.out.println(a1.acc_Amount);
       System.out.println(a2.acc_Amount);
       a1.deposit_Amount(6000);
       a2.deposit_Amount(1);

       System.out.println(a1.get_Bal());
       System.out.println(a2.get_Bal());


       a1.withdrawl_Amount(10);


       System.out.println("After Udipi tea");
       System.out.println(a1.get_Bal());
      
    }
}