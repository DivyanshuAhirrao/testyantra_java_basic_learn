class A2{

    public static void main(String[] a){

        int[] arr = {2,9,15,36,14};
        int[] new = {};

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
               sum += arr[i];
            }
        }

        System.out.println(sum);       

    }

}