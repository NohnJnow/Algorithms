package Alg.SwordToOffer;

import java.util.ArrayList;
import java.util.LinkedList;

class TreeNode2 {
    TreeNode2 left;
    TreeNode2 right;
    int value;

    public TreeNode2 (int value){
        this.value = value;
    }
}



public class Offer23 {
//    从上往下打印出二叉树的每个节点，同层节点从左至右打印。
    public ArrayList<Integer> PrintFromTopToBottom (TreeNode2 root){
        ArrayList<Integer> list =  new ArrayList<>();
        if (root == null){
            return  list;
        }
        LinkedList<TreeNode2> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            TreeNode2 node = queue.poll();
            list.add(node.value);
            if (node.left != null){
                queue.addLast(node.left);
            }
            if (node.right != null){
                queue.addLast(node.right);
            }
        }
        return list;
    }


}
