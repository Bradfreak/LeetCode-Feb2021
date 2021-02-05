public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int b = 0,coun=0,num;
        while(b < 31){
            num = (int)(Math.pow(2,b));
            if((n & num)!=0){
                coun++;
            }
            b++;
        }
        if(n < 0){
            coun++;
        }
        return(coun);
    }
}
