/* Structure of Doubly Linked List Node
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    public Node reverse(Node head) {
        // code here
        Node current = head;
        Node last = null;
        
        while(current != null){
            last = current.prev;
            current.prev = current.next;
            current.next = last;
            current = current.prev;
        }
        
        return last.prev;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna