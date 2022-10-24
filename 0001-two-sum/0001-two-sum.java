class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            if (map.get(diff) != null && map.get(diff) != i) {
                return new int[]{i, map.get(diff)};
            }

            map.put(nums[i], i);
        }

        return result;
    }
}