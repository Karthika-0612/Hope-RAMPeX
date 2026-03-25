//LeetCode 64 Minimum path Sum
import java.util.*;
public class lc64 {
     public static int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        for(int j=1;j<n;j++){
            grid[0][j]+=grid[0][j-1];
        }
        for(int i=1;i<m;i++){
            grid[i][0]+=grid[i-1][0];
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                grid[i][j]+=Math.min(grid[i-1][j],grid[i][j-1]);
            }
        }
        return grid[m-1][n-1];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] mat=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        System.out.print(minPathSum(mat));
        sc.close();
    }
}
