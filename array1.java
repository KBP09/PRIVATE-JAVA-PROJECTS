import java.util.*;

public class array1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] marks = new int[size];
        for(int i=0;i<size;i++){
            marks[i] = sc.nextInt();
        }
        System.out.println("enter the number of which you want to find the index");
        int x = sc.nextInt();
        for(int i=0;i<marks.length;i++){
            if(i==x){
            System.out.println("the index of the number that you have entered is: "+ i);
        }}
    }
}
