import java.util.*;

public class twoDarray1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows of array");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        
        int[][] numbers = new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<rows;j++){
                numbers[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter the number whose indices you want to search");
        int x = sc.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(x==numbers[i][j]){
                    System.out.println(i+","+j);
                }
            }
            System.out.println();
        }
        sc.close();
    }
}