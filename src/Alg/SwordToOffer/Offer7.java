package Alg.SwordToOffer;

import java.util.Stack;

public class Offer7 {
    /*
     * 问题描述：用两个栈实现一个队列。队列的声明如下，请实现它的两个函数appendTail和deleteHead,
     * 分别完成在队列尾部插入结点和在队列头部删除结点的功能
     */
    Stack<String> stack1 = new Stack<String>();
    Stack<String> stack2 = new Stack<String>();

    public void appendTail(String s){
        stack1.push(s);
    }
    public String deleteHead() throws Exception{
    if (stack2.isEmpty()){
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
    }
    if (stack2.isEmpty()){
        throw new Exception("队列为空");
    }
    return stack2.pop();
    }
}
