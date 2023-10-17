import java.util.*;
public class Occurancefind{
    public static int first = -1;
    public static int last = -1;

    public static void occur(String s,int b,char element){
        if(b==s.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currchar = s.charAt(b);
        if(currchar==element){
            if(first == -1){
                first = b;
            }else{
                last = b;
            }
        }
        occur(s, b+1, element);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        occur(a, 0,'a');
    }
}