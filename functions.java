import java.util.*;

public class functions{
    public static int NumberSum(int n1,int n2){
        int sum = n1 + n2;
        System.out.println(sum);
        return 0;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        NumberSum(a,b);
        sc.close();
    }
}