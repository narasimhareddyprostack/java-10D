import java.util.*;

class ALTwo{
    public static void main(String[] args){

        ArrayList al1 = new ArrayList(); 
        al1.add(10);
        al1.add(20);
        al1.add(30);
        al1.add(40);
        al1.add(50);

        ArrayList al2 = new ArrayList(); 
        al2.add(30);
        al2.add(40);
        al2.add(50);
        al1.removeAll();
        System.out.println(al1); // [10,20]
        System.out.println(al2); //[30,40,50]
    }
}