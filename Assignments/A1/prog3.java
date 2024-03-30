class Prog3{

    public static void main(String[] a){
       
      int time1  = 2;        // time in hours
      int speed1 = 55;       // speed in km/hr

      int time2  = 6;        // time in hours
      int speed2 = 35;       // speed in km/hr

      int time3 = 14;        // time in hours
      int speed3 = 71;       // speed in km/hr

      int distance1 = dist(time1,speed1);
      int distance2 = dist(time2,speed2);
      int distance3 = dist(time3,speed3);
      

      System.out.println("Test Case 1.) "+distance1);
      System.out.println("Test Case 2.) "+distance2);
      System.out.println("Test Case 3.) "+distance3);


    }

    public static int dist(int t, int s){
        return t*s;
    }

}