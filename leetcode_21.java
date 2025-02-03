class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Solution {
    public listNode mergeTwoLists(listNode list1, listNode list2) {
        listNode dummy = new listNode(0);
        listNode current = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        return dummy.next;
    }
}
public class leetcode_21 {
    public static void main(String[] args) {
        listNode l1 = new listNode(1, new listNode(2, new listNode(4)));
        listNode l2 = new listNode(1, new listNode(3, new listNode(4)));

        solution solution = new solution();
//        listNode mergedList = solution.getClass(l1, l2);

        // Print the merged list
//        listNode current = mergedList;
//        while (current != null) {
//            System.out.print(current.val + " ");
//            current = current.next;
//        }
    }
}
