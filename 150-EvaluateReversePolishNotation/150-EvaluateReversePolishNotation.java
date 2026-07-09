// Last updated: 7/9/2026, 10:14:58 AM
class Solution {
    public int evalRPN(String[] tokens) {
        int n = tokens.length;
        int[] st = new int[n];
        int top = -1;

        for(String t : tokens){
            
            if(t.equals("+")) st[top - 1] = st[top - 1] + st[top--];
            else if(t.equals("-")) st[top - 1] = st[top - 1] - st[top--];
            else if(t.equals("*")) st[top - 1] = st[top - 1] * st[top--];
            else if(t.equals("/")) st[top - 1] = st[top - 1] / st[top--];
            else st[++top] = Integer.parseInt(t);
        
        }

        return st[0];
    }
}