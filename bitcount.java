import java.util.*;
public class bitcount {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose 1 bit you have to calculate");
        int n = sc.nextInt();
        int ans = 0;
        for(int i=0;i<n;i++){
            int bitmask = 1<<i;
            int z = bitmask & n;
            if(z!=0){
                ans++;
            }}
        System.out.println("The number of 1 bits are: "+ans);
        sc.close();
    }
}
