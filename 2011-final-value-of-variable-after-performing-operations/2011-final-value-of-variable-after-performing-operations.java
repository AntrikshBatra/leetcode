class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        
        for(int i=0;i<operations.length;i++)
        {
            switch(operations[i])
            {
                case "++X":
                    case"X++":
                    x++;
                    break;
                default:
                    x--;
            }
        }
        return x;
    }
}