package Alg.SwordToOffer;

class ListNode4{
    ListNode4 next;
    int value;
    public ListNode4(){}
    public ListNode4(int value){
        this.value = value;
    }
}
public class Offer17 {
//    输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则
    //分别对比两个链表头部 谁小谁先进新链表 以此类推
    public static ListNode4 Merge(ListNode4 head1,ListNode4 head2){
        //先检测特殊情况
        if (head1 == null) {
            return head2;
        }
        if (head2 == null){
            return  head1;
        }
        ListNode4 mergeNode = null;
        if (head1.value < head2.value){
            mergeNode = head1;
            mergeNode.next = Merge(head1.next,head2);
        }else {
            mergeNode = head2;
            mergeNode.next = Merge(head1,head2.next);
        }
        return mergeNode;
    }

    public static void printList(ListNode4 merge){
        ListNode4 head = merge;
        while (head != null){
            System.out.println(head.value);
            head = head.next;
        }
        System.out.println();
    }
}
