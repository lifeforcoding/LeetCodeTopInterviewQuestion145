class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0, j = 1;
        while (j < nums.length) {
            if (nums[i] == nums[j])
                j++;
            else nums[++i] = nums[j];
        }
        return i + 1; // Return +1 because i is 0 based and we have to return the total length.
    }
}
