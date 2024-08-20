package org.example;

public class Solution {

    public static class ListNode {
        int value;
        ListNode next;

        ListNode(int value) {
            this.value = value;
            this.next = null;
        }

        ListNode(int value, ListNode next) {
            this.value = value;
            this.next = next;
        }
    }

    // Remove nodes with values greater than x
    public static ListNode removeNodes(ListNode listHead, int x) {
        ListNode dummy = new ListNode(0);
        dummy.next = listHead;

        ListNode prev = dummy;
        ListNode current = listHead;

        while (current != null) {
            if (current.value > x) {

                prev.next = current.next;
            } else {
                // Move prev to current node
                prev = current;
            }
            // Move to the next node
            current = current.next;
        }

        return dummy.next;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));

        int x = 3;

        ListNode newHead = removeNodes(head, x);

        ListNode current = newHead;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }
}
