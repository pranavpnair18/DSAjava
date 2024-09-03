package Arrays;

public class matrix {
    public static void main(String[] args) {
        int[][] matrix={
            {1,2,3},
            {4,5,6},
            {7,8,0}
        };
        check(matrix);
    }    
    public static void check(int[][] matrix)
    {
         int m = matrix.length;
         int n =matrix[0].length;


     for(int i=0;i<m;i++)
     {
        for(int j=0;j<n;j++)
        {
            if(matrix[i][j]==0)
            {
                modify(matrix,m,n,i,j);
            }
        }
     }
    }
    public static void modify(int[][] matrix, int m, int n,int i, int j)
    {
        int[][] matrix2= new int[m][n];
        for(int x=0;x<m;x++)
        {
            for(int y=0;y<n;y++)
            {
                if(x!=i && y!=j)
                {
                    matrix2[x][y]=matrix[x][y];
                }
                else{
                    matrix2[x][y]=0;
                }
            }
        }
        for (int x = 0; x < m; x++) {
            for (int y = 0; y < n; y++) {
                System.out.print(matrix2[x][y] + "\t");
            }
            System.out.println();
        }
    }
}
