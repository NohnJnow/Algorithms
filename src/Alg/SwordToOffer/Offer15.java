package Alg.SwordToOffer;

class ListNode1 {
    ListNode1 next;
    int value;
 public ListNode1 (int value) {
     this.value = value;
 }
}

public class Offer15 {
//    输入一个链表，输出该链表中倒数第k个结点。
       public  static int find(ListNode1 head,int k){
           //空链表
           if (head == null || (0==k)){
               return 0;
           }
           //链表过短
           ListNode1 first = head;
           ListNode1 second = null;
           for (int i=1; i<k ;i++){
               if (first.next != null) {//思考得有点懵逼，if循环只循环一次 就出去到for循环继续走循环了
                   first = first.next;
               }else {
                   return 0;
               }
           }
           second = head;
           while (first.next != null){
               first = first.next;
               second = second.next;
           }
           return second.value;
       }
       public static void main (String[] args) {
          Offer15 test = new Offer15();
           ListNode1 node1 = new ListNode1(1);
           ListNode1 node2 = new ListNode1(2);
           ListNode1 node3 = new ListNode1(3);
           ListNode1 node4 = new ListNode1(4);
           node1.next = node2;
           node2.next = node3;
           node3.next = node4;
           node4.next = null ;
           System.out.println(test.find(node1,4));
           System.out.println(test.find(node1,0));
           System.out.println(test.find(node1,6));
           node1=null;
           System.out.println(test.find(node1,4));
       }

}
