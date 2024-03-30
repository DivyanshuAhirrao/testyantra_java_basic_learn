class Rectangle{

    public static void main(String[] a){

       Rectangle r1 = new Rectangle();

       int ar = r1.areaOfRec(4,9);

       int para = r1.parOfRec(15,26);

       System.out.println("Area of Rectangle is : "+ar);
       System.out.println("Perameter of Rectangle is : "+para);


    }

    public int areaOfRec(int l, int b){
        return l*b;
    }

    public int parOfRec(int l, int b){
        int par = 2*(l+b);
        return par;
    }

}