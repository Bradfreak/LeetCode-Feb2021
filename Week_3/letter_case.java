//Letter Case Permutation
class Solution {
    int len;
    List<String> ans;
    public void allString(String S, int pres){
        if(pres == len){
            return;
        }
        int p = (int)S.charAt(pres);
        if(p >= 48 && p <= 57){
            pres++;
            allString(S,pres);
        }
        else if(p >= 65 && p <= 90){
            allString(S,pres+1);
            p = p+32;
            S = S.substring(0, pres) + (char)(p) + S.substring(pres+1);
            ans.add(S);
            allString(S,pres+1);
            pres++;
        }
        else if(p >= 97 && p <= 122){
            allString(S,pres+1);
            p = p-32;
            S = S.substring(0, pres) + (char)(p) + S.substring(pres+1);
            ans.add(S);
            allString(S,pres+1);
            pres++;
        }
        return;
    }
    public List<String> letterCasePermutation(String S) {
        ans = new ArrayList();
        len = S.length();
        int pres = 0;
        ans.add(S);
        allString(S, pres);
        return ans;
    }
}
