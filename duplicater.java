import java.util.*;
public class duplicater {
    public static boolean[] map = new boolean[26];
    public static void dupli(String a,int idx,String b){
        if(idx == a.length()){
            System.out.println(b);
            return;
        }
        char currchar = a.charAt(idx);
        if(map[currchar - 'a']){
            dupli(a, idx+1, b);
        }else{
            map[currchar-'a'] = true;
            b += currchar;
            dupli(a, idx+1, b);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String g = sc.nextLine();
        dupli(g, 0, "");
        sc.close();
    }
}
