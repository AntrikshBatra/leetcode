class Solution {
    List<Integer> list=new ArrayList<>();
    public List<Integer> targetIndices(int[] arr, int target) {
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                list.add(i);
            }
        }
        return list;
    }
}