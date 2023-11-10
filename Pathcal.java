public class Pathcal {
    public static int pathcal(int i,int j,int n,int m){
        if(i==n || j==m){
            return 0;
        }
        if(i==n-1 && j==m-1){
            return 1;
        }
        int downpaths = pathcal(i+1,j,n,m);
        int rightpaths = pathcal(i,j+1,n,m);
        return downpaths+rightpaths;
    }
    public static void main(String args[]){
        int totapaths = pathcal(0, 0, 3, 3);
        System.out.println(totapaths);
    }
}
