class PinCode{
    public static void main(String[] args) {
        System.out.println(validPinCode("garder"));
    }
    static boolean validPinCode(String word){
        for(char ch:word.toCharArray()){
            System.out.println(ch);
        }
    }
}