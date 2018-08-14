package Alg.SwordToOffer;

class ListNode2 {
    ListNode2 next;
    int Value;
    public ListNode2 (int data){
        this.Value = Value;
    }
}
public class Offer16 {
    //反转链表输入一个链表，反转链表后，输出链表的所有元素。
     public  int  getReverseList(ListNode2 head){
         //正在遍历的结点
         ListNode2 pNode = head;
         //结点P的前一个结点
         ListNode2 preNode = null;
         //结点P的后一个结点
         ListNode2 AfterReverseHeadNode = null;
         //鲁棒性 ： 头为空 与 只有头的情况
         if (head == null){
             return 0;
         }
         if (head.next == null){
             return head.Value;
         }else {
             //正式反转链表
             while (pNode != null){
                 ListNode2 nextNode = null;
                 nextNode = pNode.next;
                 if (nextNode == null){
                     AfterReverseHeadNode = pNode;
                 }
                 pNode.next = preNode;
                 preNode = pNode;
                 pNode = nextNode;//使整个算法向后进行的语句
             }
       return AfterReverseHeadNode.Value;
         }

     }
}
