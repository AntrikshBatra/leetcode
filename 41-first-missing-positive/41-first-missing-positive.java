class Solution {
    public int firstMissingPositive(int[] arr) {
        int i=0;
        while (i<arr.length)
        {
            int correct=arr[i]-1;

            if(arr[i]>0 && arr[i]<=arr.length && arr[i]!=arr[correct])
            {
                swap(arr,correct,i);
            }else
            {
                i++;
            }
        }

        for(int j=0;j< arr.length;j++)
        {
            if (arr[j]!=j+1)
            {
                return j+1;
            }
        }

        return arr.length+1;
    }
    
    public void swap(int[] arr,int start,int end)
    {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
