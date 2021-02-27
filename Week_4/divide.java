class Solution {
    public int divide(int di, int d) {
        int sign = ((di < 0) ^ (d < 0)) ? -1 : 1, ans = 0;
        long Di = (long)di, D = (long)d;
        if(di < 0){
            Di = Math.abs((long)di);
        }
        if(d < 0){
            D = Math.abs((long)d);
        }
        while(Di > D){
            Di = Di - D;
            ans++;
        }
        ans = (sign == -1) ? -ans : ans;
        return ans;
    }
}
