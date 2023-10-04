import java.util.*;

public class update {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int pos = 1;
        int bitmask = 1<<pos;
        int bit = sc.nextInt();
        if(bit == 1){
            int ans = bitmask | n;
            System.out.println(ans);
        }
        else if(bit == 0){
            int notbitmask = ~(bitmask);
            int ans = notbitmask & n;
            System.out.println(ans);         
        }
        else{
            System.out.println("enter a valid bit(0,1)");
        }
        sc.close();
    }
}
