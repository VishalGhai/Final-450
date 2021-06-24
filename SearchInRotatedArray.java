class Solution {
    static int search(int[] nums, int target) {
        if (target < nums[0]) {
            for (int i = nums.length - 1; i >= 0; i--) {
                if (target == nums[i])
                    return i;
            }
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (target == nums[i])
                    return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[] { 4, 5, 6, 7, 0, 1, 2 }, 0));
    }
}