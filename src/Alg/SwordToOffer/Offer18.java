package Alg.SwordToOffer;

class TreeNode{
    int value = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int value){
        this.value = value;
    }
}

public class Offer18 {
    //    输入两棵二叉树A和B，判断B是不是A的子结构;
    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null) {
            return false;
        }
        boolean result = false;
        if (root1.value == root2.value ){
            result = DoTheJudge(root1,root2);
        }
        if (!result){
            result = HasSubtree(root1.left,root2);
        }
        if (!result) {
            result = HasSubtree(root1.right, root2);
        }
        return result;
    }

    private boolean DoTheJudge(TreeNode root1,TreeNode root2){
        if (root1 ==null && root2 != null){
            return  false;
        }
        if (root2 == null){
            return  true;
        }
        if (root1.value!= root2.value){
            return  false;
        }else {
            return  DoTheJudge(root1.left,root2.left) && DoTheJudge(root1.right,root2.right);
        }
    }

}