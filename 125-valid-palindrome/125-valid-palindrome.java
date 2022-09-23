class Solution {
    public boolean isPalindrome(String s) {
        int start=0;
        int end=s.length()-1;
        
    
        while(end>start)
        {
            if(!Character.isLetterOrDigit(s.charAt(start)))
            {
                start++;
            }else if(!Character.isLetterOrDigit(s.charAt(end)))
            {
                end--;
            }else if(Character.toLowerCase(s.charAt(start++))!=Character.toLowerCase(s.charAt(end--)))
            {
                return false;
            }
        }
        return true;
    }
}