import java.util.*;

public class arrays2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        for(int i=0;i<size;i++){
            numbers[i] = sc.nextInt();
        }

        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i] < min){
                min = numbers[i];
            }
            if(numbers[i] > max){
                max = numbers[i];
            }
        }
        System.out.println("the largest number is : "+max);
        System.out.println("the smallest number is : "+min);
        sc.close();
    }
}