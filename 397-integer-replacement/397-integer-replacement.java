class Solution {
    public int integerReplacement(int n) {
        return (int)helper(n,0);
    }
    public long helper(long n,int i)
    {
        if(n==1)
        {
            return i;
        }
        if(n<1)
        {
            return 0;
        }
        
        long a=Long.MAX_VALUE;
        long b=Long.MAX_VALUE;
        long c=Long.MAX_VALUE;
        
        if(n%2==0)
        {
            a=helper(n/2,i+1);
        }else
        {
            b=helper(n+1,i+1);
            c=helper(n-1,i+1);
        }
        
        long d= Math.min(a,Math.min(b,c));
        return d;
    }
}