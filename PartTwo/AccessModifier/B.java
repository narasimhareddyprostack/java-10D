package pack1;
public class B{
    public static void main(String[] args) {
        A a=new A();
        a.m1();
        a.m2();
        a.m3();
        //a.m4();  //not possible - m4 is private 
    }
}