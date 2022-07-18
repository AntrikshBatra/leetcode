class Solution {
    int ans=0;
    public int minMoves(int target, int maxDoubles) {
        if(target==1)
        {
            return 0;
        }
        
        if(maxDoubles==0)
        {
            return target-1;
        }
        
        if(maxDoubles>0)
        {
            if(target%2==0)
            {
                ans=1+minMoves(target/2,maxDoubles-1);
            }else
            {
                ans=1+minMoves(target-1,maxDoubles);
            }
        }
        
        return ans;
    }
}