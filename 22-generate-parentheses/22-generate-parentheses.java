class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        int open=n;
        int close=n;
        solve(open,close,"",ans);
        return ans;
    }
    public void solve(int open,int close,String str,List<String> ans)
    {
        if(open==0 && close==0)
        {
            ans.add(str);
            return;
        }
        
        if(open!=0)
        {
            solve(open-1,close,str+"(",ans);
        }
        if(close>open)
        {
            solve(open,close-1,str+")",ans);
             return;
        }
       
    }
}