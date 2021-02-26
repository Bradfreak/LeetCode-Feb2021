//Validate Stack Sequences
class Solution {
    int[] push;
    int[] pop;
    int len;
    public boolean rec(int cur, Stack<Integer> st, int popped){
        if(cur == len){
            if(popped == len){return true;}
            else{
                if(st.peek() == pop[popped]){
                    st.pop();
                    return rec(cur, st, popped+1);
                }
                else{return false;}
            }
        }
        else{
            if(!st.empty()){
                if(st.peek() == pop[popped]){
                    st.pop();
                    return rec(cur, st, popped+1);
                }
            }
            st.push(push[cur]);
            return rec(cur+1,st,popped);
        }
    }
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        len = pushed.length;
        if(len == 0){return true;}
        Stack<Integer> st = new Stack<Integer>();
        push = pushed;
        pop = popped;
        return rec(0,st,0);
    }
}
