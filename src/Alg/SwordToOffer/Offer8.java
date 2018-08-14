package Alg.SwordToOffer;

public class Offer8 {
    /*
     * 题目描述：把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
     * 输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1;
     */

    public static int minElement(int array[]) throws Exception {
        // 条件判断
        if (array == null || array.length <= 0) {
            throw new Exception("Invalid parameters");
        }
        int left = 0;
        int right = array.length - 1;
        int mid = left;
        while (array[left] >= array[right]) {
            // 跳出循环的条件
            if (right - left == 1) {
                mid = right;
                break;
            }
            mid = (left + right) / 2;
            if (array[left] == array[mid] && array[mid] == array[right]) {
                return minFromSortSearch(array);
                // 算法的核心思想
            } else {
                if (array[mid] >= array[left]) {
                    left = mid;
                }
                if (array[mid] <= array[right]) {
                    right = mid;
                }
            }
        }
        return array[right];
    }

    public static int minFromSortSearch(int[] array) {
        int minEle = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minEle) {
                minEle = array[i];
            }
        }
        return minEle;
    }

    // 测试
    public static void main(String[] args) throws Exception {
        // 功能测试：输入的数组是升序排序数组的一个旋转，数组中有重复数字或者没有重复数字
        int array1[] = { 3, 4, 5, 1, 2 };
        System.out.println(minElement(array1));
        int array2[] = { 3, 4, 5, 3, 3 };
        System.out.println(minElement(array2));
        // 边界测试:输入的数组是一个升序排序数组、只包含一个数字的数组
        int array3[] = { 3 };
        System.out.println(minElement(array3));
        // 特殊输入测试：输入null指针
        int array4[] = null;
        System.out.println(minElement(array4));
    }

}
