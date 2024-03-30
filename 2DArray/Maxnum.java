class Maxnum{
    public static void main(String[] a){

      int[][] matrix = { {2,3,9} , {1,6,8} , {5,3,7} };

    //   int max = Integer.MIN_VALUE;
            System.out.println();
     
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                System.out.print(matrix[i][j]+" ");  
            }
            System.out.println();
        }

        System.out.println("------------");

        int res1[] = new int [matrix[0].length];
        int res2[] = new int [matrix[0].length];
        
        int r1 = 0;
        int r2 = 0;
        for(int i=0;i<matrix[0].length;i++){
            int max = matrix[0][i];
            for(int j=0;j<matrix.length;j++){
              if(matrix[j][i] > max){
                 max = matrix[j][i];
              }
            }
            res1[r1++] = max;
        }

        for(int i=0;i<matrix[0].length;i++){
             int max = matrix[0][i];
            for(int j=0;j<matrix.length;j++){
              if(matrix[j][i] < max){
                max  = matrix[j][i];
              }
            }
             res2[r2++] = max;
        }

        for( int n : res1){
            System.out.print(n+" ");
        }
        System.out.println("      // Largest Numbers");
        
        for( int nn : res2){
            System.out.print(nn+" ");
        }

                System.out.println("      // Smallest Numbers");

    }

}