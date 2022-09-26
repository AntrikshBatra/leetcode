class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length())
        {
            return false;
        }
        
        for(int i=0;i<s.length();i++)
        {
            String substring=s.substring(i+1);
            substring+=s.substring(0,i+1);
            
            if(goal.equals(substring))
            {
                return true;
            }
        }
        return false;
    }
}