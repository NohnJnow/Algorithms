package Alg.SwordToOffer;

public class Offer31 {
//输入一个整形数组，数组里有正数也有负数。数组中的一个或连续多个整数组成一个子数组。
// 求所有子数组的和的最大值。要求时间复杂度为n
 //或使用动态规划法
    public int FindGreatestSumOfSubArray(int[] array) {
        if (array == null || array.length == 0)
            return 0;
        int cur = array[0];
        int greatest = array[0];

        for (int i = 1; i < array.length - 1; i++) {
            if (cur < 0) {
                cur = array[i];
            } else {
                cur += array[i];
            }

            if (cur > greatest) {
                greatest = cur;
            }
        }
    return greatest;
    }
}
