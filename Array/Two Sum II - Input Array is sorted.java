/*
*Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.

Note:

Your returned answers (both index1 and index2) are not zero-based.
You may assume that each input would have exactly one solution and you may not use the same element twice.
Example:

Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.

思路：看到sorted，而且只有一个解，就想起2 pointer指针；
前后夹击，肯定可以找到；O(N)

* */

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = {-1,-1};
        if(numbers.length <=1) return res;

        int start = 0; int end = numbers.length-1;
        while(start<end){
            int sum = numbers[start] + numbers[end];
            if(sum > target){
                end--;
            } else if( sum < target){
                start++;
            } else {
                res[0] = start+1;
                res[1] = end+1;
                return res;
            }
        }
        return res;
    }
}