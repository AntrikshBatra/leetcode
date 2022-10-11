class Solution {
    public boolean increasingTriplet(int[] nums) {
        int ans1=Integer.MAX_VALUE;
        int ans2=Integer.MAX_VALUE;
        for(int n:nums)
        {
            if(n<=ans1)
            {
                ans1=n;
            }else if(n<=ans2)
            {
                ans2=n;
            }else
            {
                return true;
            }
        }
        return false;
    }
}