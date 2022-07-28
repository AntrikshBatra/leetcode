class Solution {
    Map<Integer,Integer> ans=new HashMap();
    public int climbStairs(int n) {
        if(ans.containsKey(n))
        {
            return ans.get(n);
        }
        if(n==0)
        {
            return 1;
        }
        if(n<1)
        {
            return 0;
        }
        int climb1=climbStairs(n-1);
        int climb2=climbStairs(n-2);
        
        ans.put(n,climb1+climb2);
        
        return climb1+climb2;
    }
    
    
}