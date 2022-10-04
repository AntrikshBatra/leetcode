class Solution {
    public int trailingZeroes(int n) {
        int ans=0;
        int base=5;
        while(n/base>0)
        {
            ans+=n/base;
            base=base*5;
        }
        return ans;
    }
}