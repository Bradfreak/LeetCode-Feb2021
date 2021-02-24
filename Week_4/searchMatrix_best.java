//Search a 2D Matrix II
//Recursion and best complexity
class Solution {
    int[][] mat;
    int t, m, n;
    public boolean search(int i, int j){
        if(mat[i][j] == t){return true;}
        else if(mat[i][j] > t){
            if(j - 1 < 0){return false;}
            return search(i,j-1);
        }
        else{
            if(i + 1 == m){return false;}
            return search(i+1,j);
        }
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        m = matrix.length;
        n = matrix[0].length;
        t = target;
        mat = matrix;
        return search(0, n-1);
    }
}
