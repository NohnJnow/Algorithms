package Alg.SwordToOffer;

import java.util.Stack;

public class Offer22 {
    /*
    题目描述：输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出序列。
    假设压入栈的所有数字均不相等。
    例如序列1/2/3/4/5是某栈的压栈序列，序列4/5/3/2/1是该压栈序列对应的一个弹出序列，但4/3/5/1/2就不可能是该压栈序列的弹出序列;
     */
//    public boolean isPopOrder(int[] line1,int[] line2){
//        if (line1 == null || line2 == null)
//            return false;
//        int point1 =0;
//        Stack<Integer> stack = new Stack<Integer>();
//        for (int i =0; i<line2.length; i++) {
//            if (!stack.isEmpty() && stack.peek() == line2[i]) {
//                stack.pop();
//            } else {
//                if (point1 == line1.length)
//                    return false;
//                else {
//                    do
//                        stack.push(line1[point1++]);
//                    while (stack.peek() != line2[i] && point1 != line1.length);
//                    if (stack.peek() == line2[i])
//                        stack.pop();
//                    else
//                        return false;
//                }
//            }
//        }
//            return true;
//        }
        public boolean IsPopOrder(int [] pushA,int [] popA) {
            if (pushA == null || popA == null) {
                return false;
            }
            Stack<Integer> stack = new Stack<>();
            int index = 0;

            for (int i = 0; i < pushA.length; i++) {
                stack.push(pushA[i]);
                while (!stack.isEmpty() && stack.peek() == popA[index]) {
                    stack.pop();
                    index++;
                }
            }
            return stack.isEmpty();
        }
    public static void main(String args[]) {
        int[] array1 = { 1, 2, 3, 4, 5 };
        int[] array2 = { 4, 3, 5, 1, 2 };
        Offer22 test = new Offer22();
        System.out.println(test.IsPopOrder(array1, array2));
    }

    }

