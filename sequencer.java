import java.util.*;

public class sequencer {
    public static void sequ(String a,int idx,String newstr){
        if(idx == a.length()){
            System.out.println(newstr);
            return;
        }
        char currchar = a.charAt(idx);
        sequ(a,idx+1,newstr+currchar);
        sequ(a,idx+1,newstr);
    }
    public static void main(String args[]){
        String a = "abc";
        sequ(a, 0, "");
    }
}
