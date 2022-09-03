class Solution {
    public int mySqrt(int x) {
        if(x==1)
        {
            return 1;
        }
        long start=1,end=x/2,mid=start+(end-start)/2;
        
        while(start<=end)
        {
            mid=start+(end-start)/2;
            if(x==mid*mid)
            {
                return (int)mid;
            }else if(x<mid*mid)
            {
                end=mid-1;
            }else
            {
                start=mid+1;
            }
        }
        return (int)end;
    }
}