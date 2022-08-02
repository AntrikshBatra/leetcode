class Solution {
    public boolean isPalindrome(int x) {
        int original =x;
        int reverse=0;
        while(x>0)
        {
            int rem=x%10;
            reverse=reverse*10+rem;
            x=x/10;
        }
        return original==reverse;
    }
}