# Last updated: 7/9/2026, 10:16:16 AM
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def addTwoNumbers(self, l1, l2):
        def add(l1,l2,c):
            if not l1 and not l2 and c==0:
                return None
            a=l1.val if l1 else 0
            b=l2.val if l2 else 0
            tot=a+b+c
            dummy=ListNode(tot%10)
            dummy.next=add(l1.next if l1 else None,l2.next if l2 else 0,tot/10)
            return dummy
        return add(l1,l2,0)
        