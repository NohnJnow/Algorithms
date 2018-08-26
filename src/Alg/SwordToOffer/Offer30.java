package Alg.SwordToOffer;

import java.util.ArrayList;
import java.util.Arrays;

public class Offer30 {
    //输入n个整数，找出其中最小的K个数。
    //复杂度：O(nlogk) 使用一个容器大小为K，运用堆的数据结构来实现 算法 好处是占用内存少 黑红树 也可以
public ArrayList<Integer> GetLeastNumbers_Solution(int[] input,int k){
    ArrayList<Integer> list =  new ArrayList<>();
    if (input == null || k<=0 || k>input.length){
        return  list;
    }
//    copyOfRange(int[] original, int from, int to)
//    将指定数组的指定范围复制到新数组中。
    int[] kArray = Arrays.copyOfRange(input,0,k);
    //创建大根堆
    bulidHeap(kArray); //kArray构造为堆内部已经排序了
    for (int i = k; i<input.length;i++){//已经默认将K前的数字放入容器中所以从K之后开始寻找数字
        if (input[i] < kArray[0]){//如果输入的数组与当前容器的第一个数小 则交换
            kArray[0]= input[i];
            maxHeap(kArray,0);
        }
    }
    for (int i = kArray.length-1;i>=0; i--){ //返回最后输出结果的语句
    list.add(kArray[i]);
    }
    return list;
}

public void bulidHeap(int[] input){
    for (int i= input.length/2-1 ; i>=0; i--){
        maxHeap(input,i);
    }
}


private void maxHeap(int [] array,int i ){
    int left = 2*i+1;
    int right= left+1;
    int largest = 0;

    if (left < array.length && array[left] > array[i])
        largest = left;
    else
        largest = i;
    if (right < array.length && array[right] > array[largest])
        largest = right;

    if (largest != i ){
        int temp = array[i];
        array[i] = array[largest];
        array[largest] = temp;
        maxHeap(array,largest);
        }
    }




}
