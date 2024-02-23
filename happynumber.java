import java.util.Scanner;

class happynumber{
public boolean isHappy(int n) {
    if(n==1 || n==7){
        return true;
    }
    int sum = 0;
    while(sum>9){
        while(n!=0){
        int temp = n%10;
        sum += Math.pow(temp,2);
        n /=10;}
        n = sum;
    }
    return (sum==1||sum==7);
}
public void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(isHappy(n));
}
}