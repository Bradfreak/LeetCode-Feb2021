//Arithmetic Slices
class Solution {
    public int numberOfArithmeticSlices(int[] A) {
        int len = A.length;
        int[] store = new int[len];
        int i, ans = 0;
        for(i = 2; i < len; i++){
            if(A[i]-A[i-1] == A[i-1]-A[i-2]){
                store[i] = store[i-1]+1;
                ans = ans + store[i];
            }
        }
        return ans;
    }
}
