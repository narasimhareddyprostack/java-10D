import java.util.*;

class ArrayListOne{
    public static void main(String[] args){

        ArrayList al = new ArrayList();
        al.add(10);
        al.add("Rahul");
        al.add(true);
        
        System.out.println(al.isEmpty()); //false
        System.out.println(al.contains(10)); //true 
        System.out.println(al.size()); //3
        al.clear();
        System.out.println(al); //[10,"Rahul",true]
    }
}