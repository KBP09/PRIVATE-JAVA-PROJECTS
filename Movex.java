import java.util.*;
public class Movex {
    public static void moveallx(String a,int idx,int count,String newstr){
        if(idx==a.length()){
            for(int i=0;i<count;i++){
                newstr += 'x';
            }
            System.out.println(newstr);
            return;
        }
        char currchar = a.charAt(idx);
        if(currchar=='x'){
            count++;
            moveallx(a, idx+1, count, newstr);
        }else{
            newstr += currchar;
            moveallx(a, idx+1, count, newstr);
        }     
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String g = sc.nextLine();
        moveallx(g, 0, 0, "");
        sc.close();
    }
}
