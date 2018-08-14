package Alg.SwordToOffer;



class  ListNode {
    ListNode nextNode;
    int nodeValue;
}


public class Offer13 {

    /*
     * 问题描述：给定单向链表的头指针和一个结点指针，定义一个函数在O(1)时间删除该结点。
     *
     */

    //先定义链表



        public  static  void DeleteNode(ListNode head,ListNode delListNode){
            //首先检测是否为空
            if (head == null || delListNode == null)
                return;
            //只有一个结点的情况
            if (head == delListNode){
                head = null;
            }else {
                //要删除的节点在尾部
                if (delListNode.nextNode == null){
                    ListNode pointListNode = head;
                    while (pointListNode.nextNode.nextNode != null){
                        pointListNode = pointListNode.nextNode;
                    }
                        pointListNode.nextNode = null;
                }else {
                    delListNode.nodeValue = delListNode.nextNode.nodeValue;
                    delListNode.nextNode = delListNode.nextNode.nextNode;
                }

            }
        }
        public static void main (String[] args) {
            Offer13 test = new Offer13();
                ListNode firListNode = new ListNode();
                ListNode secListNode = new ListNode();
                ListNode thisListNode = new ListNode();
                firListNode.nextNode = secListNode;
                secListNode.nextNode = thisListNode;
                firListNode.nodeValue = 1;
                secListNode.nodeValue = 2;
                thisListNode.nodeValue = 3;
                test.DeleteNode(firListNode, thisListNode);
            System.out.println(firListNode.nextNode.nodeValue);

            }


        }

