/* Structure of Linked List Node
class Node {
    int data;
    Node next;
    Node(int x) {
        this.data = x;
        this.next = null;
    }
} */
class Solution {
    public Node insertPos(Node head, int pos, int val) {
        // code here
        int count = 1;
        Node temp = head;
        if(pos == 1){
            Node ins = new Node(val);
            ins.next = head;
            return ins;
        }
        while(temp != null){
            if(count == pos-1){
                Node save = temp.next;
                temp.next = new Node(val);
                temp.next.next = save;
                break;
            }
            count++;
            temp = temp.next;
        }
        return head;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna