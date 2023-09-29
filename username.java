import java.util.*;

public class username {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Email: ");
        String email = sc.next();
        String user_name = "";
        for(int i=0;i<email.length();i++){
            if(email.charAt(i)=='@'){
                break;
            }
            else{
                user_name += email.charAt(i);
            }
        }
        System.out.println("The username is: "+user_name);
        sc.close();
    }
}
