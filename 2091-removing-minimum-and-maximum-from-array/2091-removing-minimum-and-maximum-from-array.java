class Solution {
    public int minimumDeletions(int[] arr) {

        int max=maximum(arr);
        int min=minimum(arr);
        int ans=0;
        if(max<arr.length/2)
        {
            ans+= max+1;
        }else
        {
            ans+=arr.length-max;
        }
        if (min<arr.length/2)
        {
            ans += min+1;
        }else
        {
            ans+= arr.length-min;
        }
        
        int right=Math.max(max+1,min+1);
        int left=Math.max(arr.length-min,arr.length-max);
        
        
        return Math.min(ans,Math.min(right,left));
    }
    
    
    public int maximum(int[] arr)
    {
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>arr[max])
        {
            max=i;
        }
        }
        return max;
    }
    
    
    public int minimum(int[] arr)
    {
        int min=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<arr[min])
        {
            min=i;
        }
        }
        return min;
    }
}