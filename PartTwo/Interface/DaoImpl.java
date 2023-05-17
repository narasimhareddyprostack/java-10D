interface Dao{
    public abstract void m1();
    void m2();
}
public class DaoImpl implements Dao{
       public void m1(){ System.out.println("m1 method"); }
       public void m2(){ System.out.println("m2 method");}
       public static void main(String[] args) {
        DaoImpl r=new DaoImpl();
        r.m1();
        r.m2();
       }
}