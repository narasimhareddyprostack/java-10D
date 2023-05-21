class Test { }

class Emp { }

public class EqualsTest {
    public static void main(String[] args){
     
      
        String s1 = "Rahul";
        String s2 = "Gandhi";
        String s3 = "Rahul";

        Test t1=new Test();
        Test t2=new Test();

        Emp e1 = new Emp();
        Emp e2 = new Emp();
        System.out.println(s1 == s2);  //false
        System.out.println(s1 == s3);  //true  ***



        System.out.println(t1 == t2);  //false  ***
        System.out.println(e1 == e2);  //false  ***
        System.out.println(t1.equals(t2));  //false  ***
        System.out.println(e1.equals(e2));  //false  ***

         //System.out.println(a.equals(b)); //CT
    }
}
