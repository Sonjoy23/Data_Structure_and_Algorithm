public class Insertion_Sort {
    private static void printArray (int a[]){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] ={6,7,8,1,2,3};
        //Insertion sort
        for(int i=1; i<arr.length; i++){
            int current=arr[i];
            int j=i-1;
            while (j>=0 && current<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            //placement
            arr[j+1]=current;
        }
        printArray(arr);

    }
}
