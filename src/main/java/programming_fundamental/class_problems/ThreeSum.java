package programming_fundamental.class_problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static int[][] threeSum(int[] nums) {
        if (nums == null || nums.length < 3) {
            return new int[0][0];
        }

        Arrays.sort(nums);
        List<int[]> result = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate values for the first element
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(new int[]{nums[i], nums[left], nums[right]});

                    // Skip duplicates for the second element
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    // Skip duplicates for the third element
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result.toArray(new int[result.size()][]);
    }

    public static void printTriplets(int[][] triplets) {
        System.out.print("[");
        for (int i = 0; i < triplets.length; i++) {
            System.out.print(Arrays.toString(triplets[i]));
            if (i < triplets.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] nums1 = {-1, 0, 1, 2, -1, -4};
        System.out.println("Input: " + Arrays.toString(nums1));
        System.out.print("Output: ");
        printTriplets(threeSum(nums1));

        int[] nums2 = {0, 0, 0};
        System.out.println("\nInput: " + Arrays.toString(nums2));
        System.out.print("Output: ");
        printTriplets(threeSum(nums2));
    }
}
