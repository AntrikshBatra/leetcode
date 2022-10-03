class Solution {
    public int kthGrammar(int n, int k) {
        if(k==1 && n==1)
        {
            return 0;
        }
    double length=Math.pow(2.0,n-1);
        int middle=(int)length/2;
        
        if(k<=middle)
        {
            return kthGrammar(n-1,k);
        }else
        {
            return kthGrammar(n-1,k-middle)==1?0:1;
        }
    }
}