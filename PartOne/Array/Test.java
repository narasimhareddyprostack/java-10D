class Test{
    public static void main(String[] args) {
          
        int[] marks={35,36,37,38,39,40};

        //Sum of Array elemetns 

        int sum = 0;
        for(int mark :marks){
            sum = sum + mark;
        }
        //sum = marks[0]+marks[1]+marks[2]+marks[3]+marks[4]+marks[5];
        System.out.println(sum);

    }
}