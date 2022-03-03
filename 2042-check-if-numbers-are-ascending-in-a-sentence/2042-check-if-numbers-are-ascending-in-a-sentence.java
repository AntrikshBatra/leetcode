class Solution {
    public boolean areNumbersAscending(String str) {
        ArrayList<Integer> list=new ArrayList<>();
        str = str.replaceAll("[^\\d]", " ");
        str = str.trim();
        str = str.replaceAll(" +", " ");
        String[] splitArray = str.split(" ");
        for (int i = 0; i < splitArray.length; i++) {
            list.add(Integer.parseInt(splitArray[i]));
        }

       
        if(list.isEmpty())
        {
            return true;
        }
        for(int i=1;i<list.size();i++)
        {
            if(list.get(i) <= list.get(i-1))
            {
                return false;
            }
        }

        return true;
    }
}