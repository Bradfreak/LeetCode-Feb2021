//Search a 2D Matrix II
//Recursive Way
class Solution {
    int[][] mat;
    int t, m, n;
    public boolean search(int i, int j, int[][] ans){
        if(t == mat[i][j]){return true;}
        else{
            ans[i][j] = -1;
            if(t < mat[i][j] || (i+1 == m && j+1 == n) || (i+1 == m && ans[i][j+1] == -1)){return false;}
            else{
                if(j+1 == n){return(search(i+1,j,ans));}
                else if(ans[i][j+1] == -1 && i+1 < m){return(search(i+1,j,ans));}
                else if(i+1 == m && ans[i][j+1] != -1){return(search(i,j+1,ans));}
                else{return(search(i,j+1,ans)||search(i+1,j,ans));}
            }
        } 
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        m = matrix.length;
        n = matrix[0].length;
        t = target;
        mat = matrix;
        int[][] ans = new int[m][n];
        return search(0, 0, ans);
    }
}
