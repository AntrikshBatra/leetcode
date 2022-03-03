class Solution {
    public int lengthOfLongestSubstring(String s) {
         Set<Character> sets=new HashSet<>();
        int count =0;
        int start=0;
        int end=0;
        int max_length=0;

        while(end<s.length())
        {
//            System.out.println(1);
            char c=s.charAt(end);
            if(sets.contains(c))
            {
//                System.out.println(sets.size());
                sets.clear();
                count=0;
                start++;
                end=start;
                continue;
            }
            count++;
            sets.add(c);
            max_length=Math.max(count,max_length);
            end++;
        }
        return max_length;
    }
}