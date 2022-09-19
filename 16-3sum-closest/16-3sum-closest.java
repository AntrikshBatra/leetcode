class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int minimum=Integer.MAX_VALUE;
        Arrays.sort(nums);
        int answer=0;
        
        for(int i=0;i<=nums.length-2;i++)
        {
            int fp=i+1;
            int lp=nums.length-1;
            while(lp>fp)
            {
                int sum=nums[i]+nums[fp]+nums[lp];
                if(sum==target)
                {
                    return sum;
                }else if(sum>target)
                {
                    lp--;
                    if(Math.abs(target-sum)<minimum)
                    {
                        minimum=Math.abs(target-sum);
                        answer=sum;
                    }
                }else
                {
                    fp++;
                    if(Math.abs(target-sum)<minimum)
                    {
                        minimum=Math.abs(target-sum);
                        answer=sum;
                    }
                }
            }
        }
        return answer;
    }
}