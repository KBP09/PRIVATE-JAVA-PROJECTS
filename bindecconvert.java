import java.util.*;

public class bindecconvert {
    public static void dectobin(int n){
        int binary[] = new int[40];
        int index = 0;
        while(n>0){
            binary[index++] = n%2;
            n = n/2;
        }
        for(int i=0;i<=index;i++){
            System.out.print(binary[i]);
        }
        System.out.println();
        for(int i=index-1;i>=0;i--){
            System.out.print(binary[i]);
        }
        System.out.println();
        System.out.println(binary[3]);
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        dectobin(a);
    }
}
