import java.util.*;
public class power{
    public static boolean isdivisble(int n){
        if(n==0){
            return false;
        }
        while(n!=1){
            if(n%2!=0){
                return false;
            }
            n = n/2;
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isdivisble(n)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
        sc.close();
    }
}