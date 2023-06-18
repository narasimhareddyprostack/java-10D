class Demo{
    public static void main(String[] args) {
        try{
          throw new ArithmeticException("Adhipurush Movies");
        }
        catch(Exception e){
            e.printStackTrace();
            //System.out.println(e.getMessage());
        }
        
    }
}