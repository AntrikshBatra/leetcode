class Solution {
    List<Integer> list=new ArrayList<>();
    public List<Integer> targetIndices(int[] arr, int target) {
        int prev=0;
        for(int i=0;i<arr.length;i++)
        {
            
            if(arr[i]<target)
            {
                prev++;
            }
        }
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                list.add(prev);
                prev++;
            }
        }
        return list;
    }
}