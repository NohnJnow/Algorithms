package Alg.SwordToOffer;

public class Offer10 {
    /*
     * 问题描述： 请实现一个函数，输入一个整数，输出该数二进制表示中1的个数。例如把9表示成二进制是1001，有2位是1 因此如果输入9，该函数输出2
     */

        public static int numberof1(int n ){
            int count = 0;
            while (n!=0){
                count++;
                n = n & (n-1);
            }
            return count;
        }
        
        public static void main (String[] args) {
            System.out.println(numberof1(9));
        }
}
