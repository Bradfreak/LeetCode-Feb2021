//Copy List with Random Pointer
/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node, Node> move = new HashMap<>();
        Node dup = head;
        while(dup != null){
            Node du = new Node(dup.val);
            move.put(dup,du);
            dup = dup.next;
        }
        dup = head;
        while(dup != null){
            Node du = move.get(dup);
            du.next = move.get(dup.next);
            du.random = move.get(dup.random);
            move.put(dup,du);
            dup = dup.next;
        }
        return move.get(head);
    }
}
