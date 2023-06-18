class Demo{
    public static void main(String[] args) {
        try{
            System.out.println("Good Morning");
            System.out.println(10/0);
            System.out.println("Good Night");
        }
        catch(Exception e){
            e.printStackTrace();
            //System.out.println(e.getMessage());
        }
        
    }
}