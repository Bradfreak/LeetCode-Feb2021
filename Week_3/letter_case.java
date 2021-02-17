//Letter Case Permutation
class Solution {
    int len;
    List<String> ans;
    public void allString(char[] S, int pres){
        if(pres == len){
            return;
        }
        if(Character.isDigit(S[pres])){
            pres++;
            allString(S,pres);
        }
        else if(Character.isUpperCase(S[pres])){
            allString(S,pres+1);
            S[pres] = Character.toLowerCase(S[pres]);
            ans.add(new String(S));
            allString(S,pres+1);
            pres++;
        }
        else if(Character.isLowerCase(S[pres])){
            allString(S,pres+1);
            S[pres] = Character.toUpperCase(S[pres]);
            ans.add(new String(S));
            allString(S,pres+1);
            pres++;
        }
        return;
    }
    public List<String> letterCasePermutation(String S) {
        ans = new ArrayList();
        len = S.length();
        char[] S1 = S.toCharArray();
        int pres = 0;
        ans.add(S);
        allString(S1, pres);
        return ans;
    }
}
