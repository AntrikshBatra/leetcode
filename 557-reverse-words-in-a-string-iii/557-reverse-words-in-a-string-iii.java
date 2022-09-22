class Solution {
    public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder();
        StringBuilder temp=new StringBuilder();
        int i=0;
        int j=0;
        while(i<s.length())
        {
            if(i==s.length()-1)
            {
                temp.append(s.charAt(i));
                sb.append(helper(temp.toString()));
                temp.delete(0,temp.length());
            }else if(s.charAt(i)!=' ')
            {
                temp.append(s.charAt(i));
            }else
            {
                sb.append(helper(temp.toString()));
                sb.append(" ");
                temp.delete(0,temp.length());
            }
            i++;
        }
        return sb.toString();
    }
    
    public String helper(String s)
    {
        char[] charrarr=s.toCharArray();
        s="";
        for(int i=charrarr.length-1;i>=0;i--)
        {
            s+=charrarr[i];
        }
        return s;
    }
}