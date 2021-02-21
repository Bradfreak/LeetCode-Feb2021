//Broken Calculator
class Solution {
    public int brokenCalc(int X, int Y) {
        if(X >= Y){
            return(X-Y);
        }
        else{
            int count = 0, ans = 0, dif;
            while(Y > X){
                X = X << 1;
                count++;
            }
            dif = X - Y;
            ans = count;
            while(dif>1){
                ans = ans + (dif >> count);
                dif = dif & ((1 << count) - 1);
                count--;
            }
            ans = ans + dif;
            return ans;
        }
    }
}
