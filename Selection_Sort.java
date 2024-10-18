public class Selection_Sort {
    private static void print(int a[]){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[]={4,3,2,5,1};
        // selection sort
        for(int i=0; i<arr.length-1; i++){
            int smallest=i;
            for(int j=i+1; j<arr.length; j++){
               if(arr[smallest]>arr[j]){
                   smallest=j;
               }
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;

        }

        print(arr);

    }
}
