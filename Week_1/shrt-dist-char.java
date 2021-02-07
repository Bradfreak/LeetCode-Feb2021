class Solution {
    public int[] shortestToChar(String s, char c) {
        int len = s.length(), i;
        int[] ans = new int[len];
        char[] s1 = s.toCharArray();
        ArrayList<Integer> mat = new ArrayList<Integer>();
        for(i = 0; i < len; i++){
            if(s1[i] == c){
                mat.add(i);
            }
            ans[i] = Integer.MAX_VALUE;
        }
        for(Integer k : mat){
            for(i = 0; i < len; i++){
                ans[i] = Math.min(ans[i], Math.abs(k - i));
            }
        }
        return(ans);
    }
}
