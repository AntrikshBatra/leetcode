class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int element:nums)
        {
            if(!map.containsKey(element))
            {
                map.put(element,1);
            }else
            {
                map.put(element,map.get(element)+1);
            }
        }
        int sum=0;
        for(int element:nums)
        {
            if(map.get(element)==1)
            {
                sum+=element;
            }
        }
        return sum;
    }
}