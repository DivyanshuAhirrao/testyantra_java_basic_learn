class Task81{
    public static void main(String[] a){
        int[] arr = {12, 15, 18, 21, 24};
        rev(arr);
    }
    public static void rev(int[] ar){
        System.out.print("Reversed elements are : ");
        for(int i=(ar.length-1);i>=0;i--){
            System.out.print(ar[i]+" ");
        }
    }
}