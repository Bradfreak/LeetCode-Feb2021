//Score of Parentheses
class Solution {
    public int scoreOfParentheses(String S) {
        int depth = 0, bal = 0, score = 0;
        for(char i: S.toCharArray()){
            if(i == '('){
                depth++;
                bal = 1;
            }
            else{
                depth--;
                if(bal == 1){
                    score += 1 << depth;
                    bal = 0;
                }
            }
        }
        return score;
    }
}
