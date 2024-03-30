class Sumofrow{

    public static void main(String[] a){
        System.out.println();
        int rw = 0;


        int[][] matrix = { {2,3,9} , {1,6,8} , {8,5,7} };
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                System.out.print(matrix[i][j]+" ");  
            }
            System.out.println();
            
        }
         System.out.println("-------------------------------------");
           
        for(int i=0;i<matrix.length;i++){
        
            int sum = 0 ;
        
            for(int j=0;j<matrix.length;j++){
              sum = sum + matrix[i][j]; 
            }

            System.out.print(sum+" is sum of row "+(++rw));
            System.out.println();
             
        }
                                                                                                                                                                                                                   System.out.println();  
    }
}