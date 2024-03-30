import java.util.Scanner;

class Task71{
    public static void main(String[] a){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Starting Number");
        int num1 = sc.nextInt();
        System.out.println("Enter the Ending Number");
        int num2 = sc.nextInt();



        do{
            if(num1%2==0){
                System.out.println(num1+" is a Even Number !!");      
            }
            num1++;
        }
        
        while(num1<=num2);

    }
}