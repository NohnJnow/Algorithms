package Alg.SwordToOffer;

public class Offer29 {
//数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字 array= {1,2,2,3,3,3,3}
public int MoreThanHalfNum_Solution(int[] array) {
    int maxCount = array[0];//记录最大的数字
    int number = array[0];//当前比较的数字
    int count = 1;//计数器

    for (int i = 1; i < array.length; i++) {
        if (number != array[i]) {
            if (count == 0) {
                number = array[i];
                count = 1;
            }else {
                count--;
            }
        }else {
            count++;
        }

        if (count == 1) {  //只要是count = 1 时都会记录 但是 后面的大值会把前面的小值顶掉
            maxCount = number;
        }
    }
    // 验证最大的值是不是占据了数组的一半以上
    int num = 0;
    for (int j = 0; j < array.length; j++) {
        if (array[j] == maxCount) {
            num++;
        }
    }

    if (num * 2 > array.length) {
        return maxCount;
    }
    return 0;
}
}
