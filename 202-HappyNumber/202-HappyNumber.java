// Last updated: 7/9/2026, 10:14:44 AM
class Solution {
    static int ne(int n){
        int sum=0;
        while (n>0){
            int digit=n%10;
            sum+=digit*digit;
            n/=10;
        }
        return sum;
    }
    public boolean isHappy(int n){
        int s=n;
        int f=ne(n);
        while(s!=f){
            s=ne(s); 
            f=ne(ne(f));
        }
        return s==1;
    }
}