class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int length=num.length-1;
        LinkedList<Integer> ans=new LinkedList<>();
        
        for(int i=length;i>=0;i--)
        {
            ans.addFirst((num[i]+k)%10);
            k=(num[i]+k)/10;
        }
        
        while(k>0)
        {
            ans.addFirst(k%10);
            k=k/10;
        }
        return ans;
    }
}