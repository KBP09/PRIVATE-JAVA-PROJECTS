import java.util.*;

public class TowerofHanoi {
    public static void towerofhanoi(int n ,String src,String helper,String Dest){
        if(n==1){
            System.out.println("Transfer disk "+n+" from "+src+" to "+Dest);
            return;
        }
        towerofhanoi(n-1, src, Dest, helper);
        System.out.println("Transfer disk "+n+" from "+src+" to "+Dest);
        towerofhanoi(n-1, helper, src , Dest);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        towerofhanoi(n, "S", "H", "D");
        sc.close();
    }
}
