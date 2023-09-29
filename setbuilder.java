import java.util.*;

public class setbuilder {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        StringBuilder stb = new StringBuilder(name);
        for(int i=0;i<stb.length()/2;i++){
            int front = i;
            int back = stb.length()-1-i;
            char front_char = stb.charAt(front);
            char back_char = stb.charAt(back);
            stb.setCharAt(front,back_char);
            stb.setCharAt(back,front_char);
        }
        System.out.println(stb);
        sc.close();
    }
}
