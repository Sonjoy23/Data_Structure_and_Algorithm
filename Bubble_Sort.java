
public class Bubble_Short {
    private static void bubbleSort(int[]a){
        for(int i=0; i<a.length-1; i++){
            for(int j=0; j<a.length-i-1; j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int [] a={3,4,2,6,8,9,1};
        bubbleSort(a);
        for(int i=0; i<a.length-1; i++){
            System.out.print(a[i]+"  ");
        }
        System.out.println();
    }
}
