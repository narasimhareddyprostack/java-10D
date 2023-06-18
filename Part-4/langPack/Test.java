import java.util.ArrayList;
//import java.lang.String;

public class Test {
    public static void main(String[] args) {
        float sal = 45000.000f;

        int a = 100;
        
        Integer i = a;
        
        String s = i.toString();
        
        int b = Integer.parseInt(s);
        
        float c = Float.parseFloat(s);
        double d = Double.parseDouble(s);
        System.out.println(a);
        System.out.println(i);
        System.out.println(s);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(sal);

}

}