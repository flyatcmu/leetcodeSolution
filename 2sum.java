/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

        You may assume that each input would have exactly one solution, and you may not use the same element twice.

        Example:

        Given nums = [2, 7, 11, 15], target = 9,

        Because nums[0] + nums[1] = 2 + 7 = 9,
        return [0, 1].
*/

// 思路：key : nums[i], value: index;
// 每次 用hashmap.containsKey() search (target - nums[i]),例如走到7的时候，search 9-7=2；
// 然后，拿到原来2的index，和当前的index，返回。
// 过例子，就可以推倒出算法；

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = {-1,-1};
        HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
        // key : nums[i]; value : index i;
        for(int i=0; i<nums.length; i++){
            if(!hashmap.containsKey(target-nums[i])){
                hashmap.put(nums[i], i);
            }else {
                res[0] = hashmap.get(target-nums[i]);
                res[1] = i;
            }
        }
        return res;
    }
}