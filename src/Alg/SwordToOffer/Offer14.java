package Alg.SwordToOffer;

public class Offer14 {
    /*
    问题描述：
        输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
        使得所有的奇数位于数组的前半部分，所有的偶数位于位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变
     */
 public void reOrderArray (int[] array) {
     if (array == null)
         return;

     for (int i = 1; i < array.length; i++){
         int temp = array[i];
         int j = i-1;
         if (array[i] %2 !=0){    //第二个数是奇数
             while (j >=0){
                 if (array[j] % 2 == 0){ //i前一个数为偶数时
                    int t = array[j+1];
                    array[j+1] = array[j];
                    array[j]= t;
                    j--;//j--:j索引是为了检查j索引之前还有没有偶数 如有偶数还要往后换 此算法核心
                 }
                 if (array[j] %2 != 0){
                     break;
                 }
             }
         }
         array[j+1] = temp;

     }
 }
}
