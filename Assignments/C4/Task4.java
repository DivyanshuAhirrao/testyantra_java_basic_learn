class Task4{
    public static void main(String[] a){

      int space = 25;
      int dist = 10;

      dist = dist* 100; //converting it into meter.

      int noOfHops = dist/space;

      System.out.println("Number of Hops required : "+noOfHops);

    }
}