class Solution {
    public int findDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length)
        {
            if(nums[i]!=i+1)
            {
                int correct=nums[i]-1;
                if(nums[correct]!=nums[i])
                {
                    swap(nums,i,correct);
                }
                else
                {
                    return nums[i];
                }
            }else
            {
                i++;
            }
        }
        return -1;
    }
    
    public void swap(int[] arr,int start,int end)
    {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}