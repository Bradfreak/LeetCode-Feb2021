//Minimum Remove to Make Valid Parentheses
class Solution {
    public String minRemoveToMakeValid(String s) {
        char[] str = s.toCharArray();
        int len = s.length(),op = 0, i;
        for(i = 0; i < len; i++){
            if(str[i] == '('){
                op++;
            }
            else if(str[i] == ')' && op != 0){
                op--;
            }
            else if(str[i] == ')' && op == 0){
                str[i] = '1';
            }
        }
        op = 0;
        for(i = len-1; i > -1; i--){
            if(str[i] == ')'){
                op++;
            }
            else if(str[i] == '(' && op != 0){
                op--;
            }
            else if(str[i] == '(' && op == 0){
                str[i] = '1';
            }
        }
        String s1 = new String(str);
        s1 = s1.replaceAll("1", "");
        return s1;
    }
}
