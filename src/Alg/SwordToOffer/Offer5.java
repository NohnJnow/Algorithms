package Alg.SwordToOffer;

import java.util.Stack;

//Problem5:从尾到头打印链表
//
//题目描述：输入一个链表的头结点，从尾到头反过来打印出每个结点的值.
class LinkNode{
    LinkNode next;
    int node_value;
}
public class Offer5 {
 public void reverse(LinkNode headNode){
     Stack<LinkNode> stack = new Stack<LinkNode>();
     while( headNode !=null){
         stack.push(headNode);
         headNode = headNode.next;
     }
     while (!stack.isEmpty()){
         System.out.println(stack.pop().node_value+" ");
         
     }
     System.out.println();
 }
 
 
 public static void main (String[] args) {
    Offer5 plr = new Offer5();
    LinkNode node1 = new LinkNode();
    LinkNode node2 = new LinkNode();
    LinkNode node3 = new LinkNode();
    node1.node_value = 1;
    node2.node_value = 2;
    node3.node_value = 3;
    node1.next = node2;
    node2.next = node3;
    plr.reverse(node1);
 }
}
