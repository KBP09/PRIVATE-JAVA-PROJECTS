import java.util.*;
public class bittoggle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println("Enter the position of the bit: ");
        int pos = sc.nextInt();
        System.out.println("Enter the number of program you want to do with bit");
        System.out.println("1 clear bit\n2 update bit \n3 get bit ");
        int a = sc.nextInt();
        if(a==1){
        int bitmask = 1<<pos;
        int notbit = ~(bitmask);
        int ans = notbit & n;
        System.out.println(ans);
    }   
        else if(a==2){
            int bitmask = 1<<pos;
            int ans = bitmask | n;
            System.out.println(ans);
    }   
        else if(a==3){
            int bitmask = 1<<pos;
            int ans = bitmask & n;
            System.out.println(ans);
        }
        else{
            System.out.println("Enter the correct number");
        }
        sc.close();}
}
