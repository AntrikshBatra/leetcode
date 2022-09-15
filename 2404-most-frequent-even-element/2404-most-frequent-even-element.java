class Solution {
    public int mostFrequentEven(int[] nums) {
        TreeMap<Integer,Integer> map=new TreeMap<>();
        
        for(int i:nums)
        {
            if(i%2==0)
            {
                map.put(i,map.getOrDefault(i,0)+1);
            }
        }
        if(map.size()==0)
        {
            return -1;
        }
        int ans=0,max=-1;
        
        for(Map.Entry m:map.entrySet())
        {
            if((int)m.getValue()>max)
            {
                max=(int)m.getValue();
                ans=(int)m.getKey();
            }
        }
        return ans;
    }
}