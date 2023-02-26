package twosum;

import java.util.HashMap;
import java.util.Map;

/*
    T -> O(n)
    S -> O(n)

    Using bruteForce it will be

    T -> O(n^2)
    S -> O(1)
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> diffKeyIndexValMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            Integer index = diffKeyIndexValMap.get(nums[i]);

            if (index != null) {

                return new int[]{index,i};

            }
            var diff = target - nums[i];

            diffKeyIndexValMap.put(diff, i);

        }

        return new int[2];

    }

}
