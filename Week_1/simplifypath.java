class Solution {
    public String simplifyPath(String path) {
        String[] arr = path.split("/");
        int leng = arr.length;
        String[] ans = new String[leng];
        int flen = 0, i;
        for(i = 1; i < leng; i++){
            if(arr[i].equals(".") || arr[i].length() == 0){}
            else if(arr[i].equals("..")){
                if(flen != 0){
                    flen--;
                }
            }
            else {
                ans[flen] = arr[i];
                flen++;
            }
        }
        if(flen == 0){
            return("/");
        }
        String answ = "";
        for(i = 0; i < flen; i++){
            answ = answ + "/" + ans[i];
        }
        return(answ);
    }
}
