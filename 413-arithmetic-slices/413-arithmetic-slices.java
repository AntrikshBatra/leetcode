class Solution {
    public int numberOfArithmeticSlices(int[] arr) {
        int count=0;
        int ans=0;
        int i=2;
        
        while(i<arr.length)
        {
            if(arr[i]-arr[i-1] == arr[i-1]-arr[i-2])
            {
                count++;
            }else
            {
                ans+=count * (count+1)/2;
                count=0;
            }
            i++;
        }
        
        if(count!=0)
        {
            ans+=count*(count+1)/2;
        }
        return ans;
    }
}
