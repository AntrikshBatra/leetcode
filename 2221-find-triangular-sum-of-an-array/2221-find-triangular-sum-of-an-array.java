class Solution {
    public int triangularSum(int[] nums) {
        // calculate Pascal's triangle - had to look up the name
        // if you just on a piece of paper convert the sums into calculations (instead of 3 in the node it was
        // for example 1 + 2) then you can count in the "root" of this upside-down pyramid how many
        // numbers from the top you had to sum.
        // From the LeetCode example at the "root"
        // 1 appeared 1 time
        // 2 appeared 4 times
        // 3 appeared 6 times
        // 4 appeared 4 times
        // 5 appeared 1 time
        // so 8 is just:
        // 8 = ((1 * 1) + (2 * 4) + (3 * 6) + (4 * 4) + (5 * 1)) % 10
        // you will see that on each level down from the tree those factors are sums of the ones above
        // to reduce number of allocation then we will be "pouring" one array to another, generating
        // the next levels of Pascal's triangle
        int[] array1 = new int[nums.length];
        int[] array2 = new int[nums.length];
        // top of Pascal's triangle is 1
        array1[0] = 1;
        int array1Length = 1, array2Length = 0;
        // we are "pouring" the tables until we get the same number of multiplication factors as the number of numbers
        // in the "num" array
        while (array1Length != nums.length && array2Length != nums.length) {
            // pour from one array to another
            // and then back until you get the same length as nums array (you will get all multiplication factors)
            if (array2Length < array1Length) {
                for (int i = -1; i < array1Length; ++i) {
                    int i1 = (i == -1) ? 0 : array1[i];
                    int i2 = (i + 1 == array1Length) ? 0 : array1[i + 1];
                    int sum = (i1 + i2) % 10;
                    array2[i + 1] = sum;
                }
                array2Length += 2; // compared to previous size we jump in size by 2
            } else {
                // mirrored "for" for array1
                for (int i = -1; i < array2Length; ++i) {
                    int i1 = (i == -1) ? 0 : array2[i];
                    int i2 = (i + 1 == array2Length) ? 0 : array2[i + 1];
                    int sum = (i1 + i2) % 10;
                    array1[i + 1] = sum;
                }
                array1Length += 2;
            }
        }
        // apply the found out multiplication factors
        int result = 0;
        int[] factors = array1Length == nums.length ? array1 : array2;
        for (int i = 0; i < nums.length; ++i) {
            result = (result + (factors[i] * nums[i]) % 10) % 10;
        }
        return result;
    }
}