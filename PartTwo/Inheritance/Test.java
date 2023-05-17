class Parent{
    public void m1(){
        System.out.println("Parent Class m1 method()");
    }
    public void m2(){
        System.out.println("Parent Class m2 method()");
    }
}
class Child extends Parent{
    public void  m3(){
        System.out.println("Child Class m3 method()");
    }
    public static void main(String[] args) {
        /* 
            Parent a=new Parent();
            a.m1();
            a.m2();
            //a.m3();
        */
        //Child b=new Parent();
       /*  Child c=new Child();
        c.m1();
        c.m2();
        c.m3(); */
        Parent d=new Child();
        d.m1();
        d.m2();
        d.m3();
    }
}