import java.util.*;
public class xpownstacklogn {
    public static int printpow(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        if(n % 2 == 0){
            return printpow(x,n/2) * printpow(x, n/2);
        }
        else{
            return printpow(x,n/2) * printpow(x,n/2)*x;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int ans = printpow(x, n);
        System.out.println(ans);
        sc.close();
    }
}
