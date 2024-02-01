import java.util.*;
public class pr{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
	    int T = sc.nextInt();
	    for(int i = 0;i<T;i++){
	        String s = sc.nextLine();
	        String t = sc.nextLine();
	        String ans = "";
	        for(int j = 0;j<s.length();j++){
	            if(s.charAt(j)!=t.charAt(j)){
	                ans += "B";
	            }else{
	                ans += "G";
	            }
	        }
	        System.out.println(ans);}
    }
}