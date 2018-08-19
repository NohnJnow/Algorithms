package Alg.SwordToOffer;

import java.util.ArrayList;
class TreeNode4 {
    TreeNode4 left;
    TreeNode4 right;
    int value;
    public TreeNode4(int value){
        this.value = value ;
    }
}

public class Offer25 {
//    输入一颗二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
// 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode4 root, int target){
        ArrayList<ArrayList<Integer>>   resultList = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> curResult = new ArrayList<>();
         if (root == null){
            return resultList;
        }
        int curSum = 0;
         FindPathCore(root,target,curResult,resultList,curSum);
         return resultList;
    }

    private void FindPathCore(TreeNode4 root,int target,ArrayList<Integer> curResult,
                              ArrayList<ArrayList<Integer>> resultList,int curSum){
        if (root == null){
            return;
        }
        boolean isLeaf = (root.left==null && root.right == null);
        curSum += root.value;
        if (isLeaf){
            if (curSum == target){
                resultList.add(new ArrayList<Integer>(curResult));
                curResult.remove(curResult.size()-1);
            }
            curSum -= root.value;
            return;
        }
        curResult.add(root.value);
        FindPathCore(root.left,target,curResult,resultList,curSum);
        FindPathCore(root.right,target,curResult,resultList,curSum);
        curResult.remove(curResult.size()-1);
    }
}
