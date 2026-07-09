# Last updated: 7/9/2026, 10:14:42 AM
class Solution(object):
    def reverseList(self, head):
        prev = None
        curr = head

        while curr:
            nxt = curr.next  
            curr.next = prev 
            prev = curr      
            curr = nxt        

        return prev
