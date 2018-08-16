package Alg.SwordToOffer;

class TreeNode1 {
    TreeNode1 leftNode;
    TreeNode1 rightNode;
    int value;

}
public class Offer19 {
//    请完成一个函数，输入一个二叉树，该函数输出它的镜像;
    public static void MirrorRecursively (TreeNode1 root){
        if (root == null) {
            return;
        }
        if (root.leftNode == null || root.rightNode == null){
            return;
        }
        int tempValue; //临时节点 用来保存交换节点
        tempValue  = root.leftNode.value;
        root.leftNode.value = root.rightNode.value;
        root.rightNode.value = tempValue;
        //递归的方式操作左右结点
        if (root.leftNode != null){
            MirrorRecursively(root.leftNode);
        }
        if (root.rightNode != null){
            MirrorRecursively(root.rightNode);
        }
    }
    public static void main (String[] args) {
        TreeNode1 root1 = new TreeNode1();
        TreeNode1 node1 = new TreeNode1();
        TreeNode1 node2 = new TreeNode1();
        TreeNode1 node3 = new TreeNode1();
        TreeNode1 node4 = new TreeNode1();
        TreeNode1 node5 = new TreeNode1();
        TreeNode1 node6 = new TreeNode1();
        root1.leftNode = node1;
        root1.rightNode = node2;
        node1.leftNode = node3;
        node1.rightNode = node4;
        node2.leftNode =  node5;
        node2.rightNode = node6;
        root1.value = 8;
        node1.value = 8;
        node2.value = 7;
        node3.value = 9;
        node4.value = 2;
        node5.value = 4;
        node6.value = 7;

        Offer19.MirrorRecursively(root1);
    }
}
