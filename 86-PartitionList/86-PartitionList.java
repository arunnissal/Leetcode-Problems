// Last updated: 8/8/2026, 10:02:27 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode partition(ListNode head, int x) {
13        ListNode smallDummy = new ListNode(0);
14        ListNode largeDummy = new ListNode(0);
15        ListNode small = smallDummy;
16        ListNode large = largeDummy;
17        ListNode curr = head;
18        while (curr != null) {
19            if (curr.val < x) {
20                small.next = curr;
21                small = small.next;
22            } else {
23                large.next = curr;
24                large = large.next;
25            }
26            curr = curr.next;
27        }
28        large.next = null;
29        small.next = largeDummy.next;
30        return smallDummy.next;
31    }
32}