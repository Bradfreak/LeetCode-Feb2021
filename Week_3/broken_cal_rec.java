//Broken Calculator using recursion
class Solution {
    public int brokenCalc(int X, int Y) {
        if(X >= Y){
            return(X-Y);
        }
        else{
            if((Y & 1) == 1){
                Y = (Y + 1) >> 1;
                return(2+brokenCalc(X,Y));
            }
            else{
                Y = Y >> 1;
                return(1+brokenCalc(X,Y));
            }
        }
    }
}
