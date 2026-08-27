class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long sum = 0;
        long max = 0;

        HashSet<Integer> set = new HashSet<>();
        int left = 0;

        for(int right =0;right<nums.length;right++){
            while(set.contains(nums[right])){
                sum -= nums[left];
                set.remove(nums[left]);
                left++;
            }
            sum += nums[right];
            set.add(nums[right]);

            if(right - left +1 == k){
                max = Math.max(sum ,max);
                sum -= nums[left];
                set.remove(nums[left]);
                left++;
            }
        }
        return max;
    }
}