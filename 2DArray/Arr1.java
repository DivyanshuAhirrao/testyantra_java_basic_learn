import java.util.Scanner;

class Arr1{

    public static void main(String[] a){
        
        Scanner sc = new Scanner(System.in);

        int[][] two_arr1 = new int[2][2];
        double[][] two_arr2 = new double[3][3];
        char[][] two_arr3 = new char[2][3];
        boolean[][] two_arr4 = new boolean[3][2];
        

        for(int i=0;i<two_arr1.length;i++){
            for(int j=0;j<two_arr1.length;j++){
                System.out.println("Enter the Number :");
                int ar = sc.nextInt();
                two_arr1[i][j] = ar;
            }   
        }


        System.out.println();
        System.out.println("-----------------------------");
        System.out.println();


        for(int i=0;i<two_arr1.length;i++){
            for(int j=0;j<two_arr1.length;j++){
                System.out.print(two_arr1[i][j]+" ");  
            }
            System.out.println();
        }

        //----------Double-------------//


        for(int i=0;i<two_arr2.length;i++){
            for(int j=0;j<two_arr2.length;j++){
                System.out.println("Enter the Double Value :");
                double ar = sc.nextDouble();
                two_arr2[i][j] = ar;
            }   
        }

        
        System.out.println();
        System.out.println("-----------------------------");
        System.out.println();


        for(int i=0;i<two_arr2.length;i++){
            for(int j=0;j<two_arr2.length;j++){
                System.out.print(two_arr2[i][j]+" ");  
            }
            System.out.println();
        }

        //----------Character-------------//


        for(int i=0;i<two_arr3.length;i++){
            for(int j=0;j<two_arr3.length;j++){
                System.out.println("Enter the Double Value :");
                char ar = sc.nextChar();
                two_arr3[i][j] = ar;
            }   
        }

        
        System.out.println();
        System.out.println("-----------------------------");
        System.out.println();


        for(int i=0;i<two_arr3.length;i++){
            for(int j=0;j<two_arr3.length;j++){
                System.out.print(two_arr3[i][j]+" ");  
            }
            System.out.println();
        }

        //----------Boolean-------------//


        for(int i=0;i<two_arr4.length;i++){
            for(int j=0;j<two_arr4.length;j++){
                System.out.println("Enter the Double Value :");
                boolean ar = sc.nextBoolean();
                two_arr4[i][j] = ar;
            }   
        }

        
        System.out.println();
        System.out.println("-----------------------------");
        System.out.println();


        for(int i=0;i<two_arr4.length;i++){
            for(int j=0;j<two_arr4.length;j++){
                System.out.print(two_arr4[i][j]+" ");  
            }
            System.out.println();
        }







    }

}