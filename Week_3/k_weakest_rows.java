//The K Weakest Rows in a Matrix
class Solution {
    void sort(int arr1[], int arr2[]) 
    { 
        int n = arr1.length, i, j, key1, key2;
        for (i = 1; i < n; ++i) { 
            key1 = arr1[i];
            key2 = arr2[i];
            j = i - 1; 
            while (j >= 0 && arr1[j] > key1) { 
                arr1[j + 1] = arr1[j];
                arr2[j + 1] = arr2[j];
                j = j - 1; 
            } 
            arr1[j + 1] = key1;
            arr2[j + 1] = key2;
        } 
    } 
    public int[] kWeakestRows(int[][] mat, int k) {
        int len = mat.length, i;
        int[] sum = new int[len];
        int[] ind = new int[len];
        for(i = 0; i < len; i++){
            ind[i] = i;
            for(int j: mat[i]){
                sum[i] += j;
            }
        }
        sort(sum, ind);
        int[] ans = new int[k];
        for(i = 0; i < k; i++){
            ans[i] = ind[i];
        }
        return ans;
    }
}
