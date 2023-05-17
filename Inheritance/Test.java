class Parent{
        public void m1(){
            System.out.println("Parent Class m1() method");
        }
        public void m2(){
            System.out.println("Parent Class m2() method");
        }
}
class Child extends Parent{
        public void m3(){
            System.out.println("Child Class m3() method");
        }
}
public class Test{
        public static void main(String[] args) {
                     Child obj1=new Child();
                     obj1.m1();
                     obj1.m2();
                     obj1.m3();

                    Parent obj2=new Child();
                     obj2.m1();
                     obj2.m2();
                     //obj2.m3();
                   Parent obj3=new Parent();
                   obj3.m1();
                   obj3.m2();
                   //Child obj4=new Parent();
        }
}