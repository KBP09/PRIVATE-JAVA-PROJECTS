import java.util.*;

public class Excerq1 {
    public static void functionse(int x,int y,int z){
        int sum = x + y + z;
        int average = sum/3;
        System.out.println(average);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
    functionse(a, b, c);
        sc.close();
    }
}
