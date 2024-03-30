class Circle{

    public static void main(String[] a){

      Circle c1 = new Circle();
       
      int rad = 5;
      double areaOfCircle = c1.area(rad); 
      System.out.println("Area of Circle is : "+areaOfCircle);

    }

    public double area(int radius){
        return 3.14*radius*radius;
    }

}