/*Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
Follow up: Could you implement a solution using only O(1) extra space complexity and O(n) runtime complexity?
Constraints:
        n == nums.length
        1 <= n <= 104
        0 <= nums[i] <= n
All the numbers of nums are unique.*/

public class MissingPositiveNumberFromArray {
    public static void main(String[] args) {
        System.out.println(" Missing Numbers :: "+  missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));
    }

    public static int missingNumber(int[] nums) {
        int sumofNNumbers = (nums.length * (nums.length+1)) /2;
        int sum = 0;
        for (int i:nums) {
            sum = sum+i;
        }
        return sumofNNumbers -sum;
    }
}
