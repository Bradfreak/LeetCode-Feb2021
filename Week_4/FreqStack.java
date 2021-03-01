//Maximum Frequency Stack
class FreqStack {
    
    PriorityQueue<Node> pq;
    HashMap<Integer, Integer> map;
    int index;
    
    public FreqStack() {
        map = new HashMap<Integer, Integer>();
        pq = new PriorityQueue<Node>();
        index = 0;
    }
    
    public void push(int x) {
        if(map.containsKey(x)){map.put(x, map.get(x)+1);}
        else{map.put(x,1);}
        pq.add(new Node(x,map.get(x),index++));
    }
    
    public int pop() {
        int ans = pq.remove().value;
        
        if(map.get(ans) == 1){map.remove(ans);}
        else{map.put(ans, map.get(ans)-1);}
        return ans;
    }
    
    class Node implements Comparable<Node>{
        int value;
        int freq;
        int index;
        
        public Node(int val, int f, int in){
            this.value = val;
            this.freq = f;
            this.index = in;
        }
        
        public int compareTo(Node n){
            if(this.freq == n.freq){
                return n.index - this.index;
            }
            
            return n.freq - this.freq;
        }
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 */
