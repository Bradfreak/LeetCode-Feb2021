//Longest Word in Dictionary through Deleting
class Solution {
    public String findLongestWord(String s, List<String> d) {
        String maxw = "";
        int len = d.size(), lens = s.length(), lend, i, max = 0, j, k;
        char[] str = s.toCharArray();
        for(i = 0; i < len; i++){
            if(d.get(i).length() < max){continue;}
            char[] temp = d.get(i).toCharArray();
            j = 0;k = 0;lend = temp.length;
            while(j < lens && k < lend){
                if(str[j++] == temp[k]){
                    k++;
                }
            }
            if(k == lend){
                if(lend == max){
                    if(maxw.compareTo(d.get(i)) > 0){
                        maxw = d.get(i);
                    }
                }
                else{
                    maxw = d.get(i);
                    max = lend;
                }
            }
        }
        return maxw;
    }
}
