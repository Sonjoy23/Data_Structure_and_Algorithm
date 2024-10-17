public class LinearSearch {
    private static int LinearS(int[] a, int b){
        int m;
        for(int i=0; i<a.length; i++){
            if(b==a[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9};

        int n=LinearS(a,5);
        if(n== -1){
            System.out.println("not found");

        }else {
            System.out.println("index is: "+n);
        }

    }
}