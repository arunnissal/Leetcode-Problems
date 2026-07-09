# Last updated: 7/9/2026, 10:15:57 AM
class Solution(object):
    def mergeKLists(self, lists):
        if not lists:
            return None
        return self.divide(lists,0,len(lists)-1)
    def divide(self,lists,left,right):
        if left==right:
            return lists[left]
        mid= (left+right)//2
        l1=self.divide(lists,left,mid)
        l2=self.divide(lists,mid+1,right)
        return self.merge(l1,l2)

    def merge(self,l1,l2):
        if not l1:
            return l2
        if not l2:
            return l1
        if l1.val<=l2.val:
            l1.next=self.merge(l1.next,l2)
            return l1
        else :
            l2.next=self.merge(l1,l2.next)
            return l2