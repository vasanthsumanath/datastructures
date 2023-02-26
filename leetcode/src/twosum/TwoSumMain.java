package twosum;

public class TwoSumMain {

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();

        int[] ints = twoSum.twoSum(new int[]{2, 7, 11, 15}, 9);

        System.out.printf("[%d,%d]",ints[0],ints[1]);

    }
}
