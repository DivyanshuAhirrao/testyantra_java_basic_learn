class Task42{
    public static void main(String[] a){
       
       //solution :- declare the variable in main block, then initialize it in block scope atlast print in main block.

       
       {
        int var = 10;
       }

       System.out.println(var);

    }
}