// class Demo {
//     public static void main(String[] a){
//         int i = 10;

//         while(i++ <= 10){
//             i++;
//         }    
//         System.out.println(i);   //13 ?
//     }

// }




class A1{

    public static void main(String[] a){

        int[] arr = {2,9,15,36,14};
        int[] even = {};
        int sum = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
               sum += arr[i];
            }
        }

        System.out.println(sum);       

    }

}