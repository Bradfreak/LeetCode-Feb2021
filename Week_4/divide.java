class Solution {
    public int divide(int di, int d) {
        if(di == -2147483648 && d == -1){
            return 2147483647;
        }
        if(d == 1){
            return di;
        }
        if(d == -1){
            return -di;
        }
        int ans = 0, sh, sign = ((di < 0) ^ (d < 0)) ? -1 : 1;
        long Di = Math.abs((long)di);
        long D = Math.abs((long)d);
        while(Di >= D){
            sh = 1;
            while(Di >= (D << sh)){
                sh++;
            }
            Di = Di - (D << (sh -1));
            ans = ans + (1 << (sh - 1));
        }
        ans = (sign == -1) ? -ans : ans;
        return ans;
    }
}
