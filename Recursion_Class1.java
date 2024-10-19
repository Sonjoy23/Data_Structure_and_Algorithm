//print sum of first n natural numbers
public class Recursion_Class1 {
    public static void sumNum(int n, int sum,int i){
        // Base case
        if(n==i){
            sum=sum+i;
            System.out.println("Total number: "+sum);
            return;
        }
        sum=sum+i;
        //Recursion
        sumNum(n,sum,i+1);

    }
    public static void main(String[] args) {
        sumNum(10,0,1);
    }
}
