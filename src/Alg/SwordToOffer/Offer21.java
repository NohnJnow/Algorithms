package Alg.SwordToOffer;

import java.util.Stack;

public class Offer21 {
    //设置辅助栈用来保存最小的元素
    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    public Offer21(){
        stackData = new Stack<Integer>();
        stackMin = new Stack<Integer>();
    }

    public void push(int node){
        stackData.push(node);
        if (stackMin.empty()){
            stackMin.push(node);
        }else {
            if (node <= stackMin.peek()){ //peek() 表示的是查看堆栈顶部的对象,但不从堆栈中移除它
                stackMin.push(node);
            }
        }
    }

    public void pop (){
        int data = stackData.pop();
        if (data == stackData.peek()){
            stackMin.pop();
        }
    }
//
//    public int top(){
//        return  stackData.peek();
//    }
    public int min(){
        return  stackMin.peek();
    }
}
