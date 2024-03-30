class Prog2{

    public static void main(String[] a){
       
      int data1 = cube(5);
      int data2 = cube(13);
      int data3 = cube(9);

      System.out.println("Test Case 1.) "+data1);
      System.out.println("Test Case 2.) "+data2);
      System.out.println("Test Case 3.) "+data3);


    }

    public static int cube(int a){
        return a*a*a;
    }

}