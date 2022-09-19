class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> answer=new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++)
        {
            int fp=i+1;
            int lp=nums.length-1;
            while(lp>fp)
            {
                int sum=nums[i]+nums[fp]+nums[lp];
                if(sum>0)
                {
                    lp--;
                }else if(sum<0)
                {
                    fp++;
                }else
                {
                    List<Integer> temp=new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[fp]);
                    temp.add(nums[lp]);
                    lp--;
                    fp++;
                    answer.add(temp);
                }
            }
        }
        return new ArrayList<>(answer);
    }
}