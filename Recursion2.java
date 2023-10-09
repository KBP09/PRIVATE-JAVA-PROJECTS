import java.util.*;
public class Recursion2{
    public static void numsum(int i,int n,int sum){
        if(i==n){
            sum+=i;
            System.out.println("the sum is:"+sum);
            return;
        }
        sum+=i;
        numsum(i+1,n,sum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting number");
        int p = sc.nextInt();
        System.out.println("Entet the number where to end the sum");
        int q = sc.nextInt();
        numsum(p, q, 0);
    }
}