//https://leetcode.com/problems/maximize-the-topmost-element-after-k-moves/
class Solution {
    public int maximumTop(int[] nums, int k) {
        if (nums.length == 1){
            if (k % 2 == 1){
                return -1;
            };
            return nums[0];
        };
        if (k <= 1){
            return nums[k];
        };
        if (k < nums.length){
            return Math.max(Arrays.stream(Arrays.copyOfRange(nums, 0, k - 1)).max().getAsInt(), nums[k]);
        }
        else if (k == nums.length){
            return Arrays.stream(Arrays.copyOfRange(nums, 0, k - 1)).max().getAsInt();
        };
        return Arrays.stream(nums).max().getAsInt();
    }
}
