import java.util.*;
public class spiralcode {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int matrix[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int top = 0;
        int down = n-1;
        int right = m-1;
        int left = 0;
        ArrayList<Integer> ans = new ArrayList<Integer>();
        while(top<=down && left<=right){
            for(int dir=0;dir<=3;dir++){
            if(dir == 0){
                for(int i=top;i<=right;i++){
                    ans.add(matrix[top][i]);
                }
                top++;
            }
            else if(dir == 1){
                for(int i=top;i<=down;i++){
                    ans.add(matrix[i][right]);
                }
                right--;
            }
            else if(dir == 2){
                for(int i=right;i>=left;i--){
                    ans.add(matrix[down][i]);
                }
                down--;
            }
            else if(dir == 3){
                for(int i=down;i>=top;i--){
                    ans.add(matrix[i][left]);
                }
                left++;
            }}
        }
        System.out.println(ans);
    }
}
