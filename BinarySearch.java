public class BinarySearch {
    private static int number(int[] a, int b){
        int first=0; int last=a.length-1;

        while (first<=last){
            int mid=(first+last)/2;
            if(a[mid]==b){
                return mid;
            } else if (a[mid]<b) {
                first=mid+1;
            }else {
                last=mid-1;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int [] a={1,2,3,4,5,6,7,8,9,10};
        int b=9;
        int ind=number(a,b);
        if(ind==-1){
            System.out.println("Not Found");
        }else {
            System.out.println("Index is "+ind);
        }


    }
}
