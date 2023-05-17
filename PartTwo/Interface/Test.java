interface A{
    void m1();
}
interface B{
   int m2();
}
class C implements A,B{
    public void m1(){}
    public int m2(){
        return 100;
    }
}
class Test{
    public static void main(String[] args) {
            B swetha =new C();
           int party_Money= swetha.m2();
           System.out.println(party_Money);
    }
}