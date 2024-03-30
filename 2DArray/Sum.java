
import java.util.Scanner;

class Sum{

    public static void main(String[] a){
        
        Scanner sc = new Scanner(System.in);

        int[][] two_arr1 = {{2,3},{6,8}};
        int[][] two_arr2 = {{5,9},{1,7}};
        int[][] res = new int[2][2];    

        for(int i=0;i<two_arr1.length;i++){
            for(int j=0;j<two_arr1.length;j++){
              res[i][j] = two_arr1[i][j] + two_arr2[i][j]; 
            }   
        }
        
        for(int i=0;i<two_arr1.length;i++){
            for(int j=0;j<two_arr1.length;j++){
                System.out.print(two_arr1[i][j]+" ");  
            }
            System.out.println();
        }

            System.out.println(" +    ");

         for(int i=0;i<two_arr1.length;i++){
            for(int j=0;j<two_arr1.length;j++){
                System.out.print(two_arr2[i][j]+" ");  
            }
            System.out.println();
        }

        System.out.println("-----------------------------");
        System.out.println();

        for(int i=0;i<two_arr1.length;i++){
            for(int j=0;j<two_arr1.length;j++){
                System.out.print(res[i][j]+" ");  
            }
            System.out.println();
        }


    }

}