import java.util.*;
public class Strictlyinc {
    public static boolean finder(int arr[],int idx){
        if(arr[idx]==arr.length-1){
            return true;
        }
        if(arr[idx]<arr[idx+1]){
            return finder(arr, idx+1);
        }else{
            return false;
        }
    }
    public static boolean greatfind(int arr[],int idx){
        if(arr[idx]==arr.length-1){
            return true;
        }
        if(arr[idx]>arr[idx+1]){
            return greatfind(arr, idx+1);
        }else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array-");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("choose what you want to find");
        System.out.println("1.Strictly increasing \n2.Strictly decreasing");
        int k = sc.nextInt();
        if(k==1){
            System.out.println(finder(arr, 0));
        }
        else if(k==2){
            System.out.println(greatfind(arr, 0));
        }
        else{
            System.out.println("wrong number");
        }
        sc.close();
    }
}
