import java.util.*;
public class XnR {
    public static int printpow(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int nPow1=printpow(x,n-1);
        int npown=x * nPow1;
        return npown;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value whose multiple you want to find");
        int x = sc.nextInt();
        System.out.println("Enter the value to whose power you want to find");
        int n = sc.nextInt();
        int ans = printpow(x,n);
        System.out.println("The multiple of x is: "+ans);
        sc.close();
    }
}
