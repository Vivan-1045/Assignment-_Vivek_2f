class listNode {
    int val;
    listNode next;
    listNode() {}
    listNode(int val) { this.val = val; }
    listNode(int val, listNode next) { this.val = val; this.next = next; }
}
class solution {
    public listNode reverseList(listNode head) {
        listNode prev = null;
        listNode curr = head;
        while (curr != null) {
            listNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
}
public class leetcode_206 {
    public static void main(String[] args) {
        listNode head = new listNode(1);
        head.next = new listNode(2);
        head.next.next = new listNode(3);
        head.next.next.next = new listNode(4);
        head.next.next.next.next = new listNode(5);

        solution solution = new solution();
        listNode reversedHead = solution.reverseList(head);

        // Print the reversed list
        listNode curr = reversedHead;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
    }
}
