class Solution {
    public int findKthPositive(int[] arr, int k) {
        
        int i =0, curr = 0, missing = 0;
        // pause the array scan when you see missing number and 
        // decrease the k and store missing 
        // continue array scan when you see the numbers are not missing
        
        while(k >= 0) {
            if(i < arr.length && arr[i] == curr) {
               i++;
            }  else {
                k--;
                missing = curr;
            } 
            curr++;
        }
        return missing;
    }
    }
