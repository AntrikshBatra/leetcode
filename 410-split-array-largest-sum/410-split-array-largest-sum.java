class Solution {
    public int splitArray(int[] nums, int m) {
        int start=0;
        int end=0;
        
        for(int i=0;i<nums.length;i++){
            start=Math.max(start,nums[i]);
            end+=nums[i];
        }
        
        
        while(start < end)
        {
            int sum=0;
            int pieces=1;
            int mid=start+(end-start)/2;
            
            for(int element : nums)
            {
                if(sum+element>mid)
                {
                    sum=element;
                    pieces++;
                }else
                {
                    sum+=element;
                }
            }
            if(pieces<=m)
            {
                end=mid;
            }else
            {
                start=mid+1;
            }
        }
        return end;
    }
}