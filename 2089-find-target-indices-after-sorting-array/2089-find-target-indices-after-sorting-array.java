class Solution {
    List<Integer> list=new ArrayList<>();
    public List<Integer> targetIndices(int[] arr, int target) {
        for(int i=0;i<arr.length;i++)
        {
            Arrays.sort(arr);
            if(arr[i]==target)
            {
                list.add(i);
            }
        }
        return list;
    }
}