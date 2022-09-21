class Solution {
    public int nextGreaterElement(int n) {
        char[] arr=(n + "").toCharArray();
        int fp,lp;
        for(fp=arr.length-1;fp>0;fp--)
        {
            if(arr[fp-1]<arr[fp])
            {
                break;
            }
        }
        if(fp==0)
        {
            return -1;
        }
        for(lp=arr.length-1;lp>fp;lp--)
        {
            if(arr[fp-1]<arr[lp])
            {
                break;
            }
        }
        char temp=arr[fp-1];
        arr[fp-1]=arr[lp];
        arr[lp]=temp;
        
        Arrays.sort(arr,fp,arr.length);
        
        long val = Long.parseLong(new String(arr));
        if(val <= Integer.MAX_VALUE){
            return (int) val;}
        
        return -1;
    }
}