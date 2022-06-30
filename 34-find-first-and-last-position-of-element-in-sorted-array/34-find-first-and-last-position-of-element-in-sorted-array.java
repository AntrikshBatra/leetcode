class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=firstIndex(nums,target,true);
        int last=firstIndex(nums,target,false);

        if(first==-1)
        {
            return new int[]{-1,-1};
        }

        return new int[]{first,last};
    }
    
    public int firstIndex(int[] arr,int target,boolean first)
    {
        int start=0;
        int end=arr.length-1;
        int ans=-1;

        while(start <= end)
        {
            int mid=start+(end-start)/2;
            if(target < arr[mid])
            {
                end=mid-1;
            }else if(target > arr[mid])
            {
                start=mid+1;
            }else
            {
                if(first)
                {
                    end=mid-1;
                    ans=mid;
                }else
                {
                    start=mid+1;
                    ans=mid;
                }
            }
        }
        return ans;
    }
}