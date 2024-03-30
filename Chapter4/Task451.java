class Task451{
    public static void main(String[] a){
       
       int num = 12;
       String check = (num%3==0 && num%5==0) ? "Yes "+num+" is divisible by 3 and 5." :  "No "+num+" is not divisible by 3 and 5." ;

       System.out.println(check);
    }

}