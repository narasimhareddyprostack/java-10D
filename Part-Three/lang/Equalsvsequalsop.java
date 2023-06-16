class Test { }

class Emp { }

public class Equalsvsequalsop {
    public static void main(String[] args){
        int a = 100;
        int b = 100;
        int c = 300;
        Integer i = 100;
        Integer j = 300;
        Integer k = new Integer(100);
        Integer l = new Integer(100);
        String s1 = "Rahul";
        String s2 = "Gandhi";
        String s3 = "Rahul";

        Test t1=new Test();
        Test t2=new Test();

        Emp e1 = new Emp();
        Emp e2 = new Emp();
        System.out.println(a == b);  //true
        System.out.println(k == l);  //false  ***
        System.out.println(k.equals(l));  //false  ***

         //System.out.println(a.equals(b)); //CT
    }
}
