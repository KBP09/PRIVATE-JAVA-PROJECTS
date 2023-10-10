import java.util.*;

public class factorialR {
    // public static void facto(int i,int n,int multi){
    //     if(i==n){
    //         multi*=i;
    //         System.out.println(multi);
    //         return;
    //     }
    //     multi*=i;
    //     facto(i+1,n,multi);
    // }
    public static int calfact(int n){
        if(n==1 || n==0){
            return 1;
        }
        int num1 = calfact(n-1);
        int fact_n = n * num1;
        return fact_n;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int multi = 1;
        int j = 1;
        int n = sc.nextInt();
        // facto(j,n,multi);
        // for(int i=1;i<=n;i++){
        //     multi*=i;
        // }
        // System.out.println(multi);
        int ans = calfact(n);
        System.out.println(ans);
        sc.close();
    }
}
