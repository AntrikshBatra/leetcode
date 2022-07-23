class Solution {
    public int lengthOfLastWord(String s) {
        String str=s.trim();
        int count=0;
        
        for(int i=0;i<str.length();i++)
        {
            Character ch=str.charAt(i);
            if(ch.equals(' '))
            {
                count=0;
            }else
            {
                count=count+1;
            }
        }
        
        return count;
    }
}