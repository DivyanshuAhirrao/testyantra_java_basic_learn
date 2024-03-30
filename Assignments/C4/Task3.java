class Task3{
    public static void main(String[] a){

      int amt, div, noOfTrans, rem;
      
      amt = 2700;
      div = 200;

      noOfTrans = amt/div;
      rem =  amt-(noOfTrans*div);

      System.out.println("Number of Transaction Required are : "+noOfTrans);
      System.out.println("Amount Remaining is : "+rem);
      
    }
}