import java.util.*;
public class Reversestr{
    public static void reverser(String str,int idx){
        if(idx==0){
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        reverser(str, idx-1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        reverser(str, str.length()-1);
        sc.close();
    }
}