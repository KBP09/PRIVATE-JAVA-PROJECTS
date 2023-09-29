import java.util.*;

public class transposemat{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int matrix[][] = new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        System.out.println("The transpose of the matrix is: ");
        for(int j=0;j<cols;j++){
            for(int i=0;i<rows;i++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
}