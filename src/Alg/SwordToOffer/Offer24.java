package Alg.SwordToOffer;

public class Offer24 {
//    输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
//    public boolean VerifySquenceOfBST(int[] sequence, int length){
//        if (sequence == null || length <= 0){
//            return  false;
//        }
//        int root = sequence[length-1];
//
//        //在二叉搜索数中左子树节点的值大于根节点的值
//        int i =0;
//        for (; i<length-1;++i){
//            if (sequence[i] > root)
//                break;
//        }
//
//        //在二叉搜索树中右子树结点的值大于根节点的值
//        int j =i ;
//        for (; j < length-1 ; ++j){
//            if (sequence[j] < root)
//                return false;
//        }
//        //判断左子树是不是二叉搜索树
//        boolean left = true;
//        if (i>0)
//            left = VerifySquenceOfBST(sequence,i);
//        //判断右子树是不是二叉搜索树
//        boolean right = true;
//        if (i < length-1)
//            right = VerifySquenceOfBST(sequence + i,length-i-1);
//
//
//        return (left && right);
//    }
public boolean VerifySquenceOfBST(int [] sequence) {
    if(sequence.length == 0) return false;
    return IsTreeBST(sequence, 0, sequence.length-1);
}
    public boolean IsTreeBST(int [] sequence,int start,int end ){
        //if(end <= start) return true;
        int i = start;
        for (; i < end; i++) {
            if(sequence[i] > sequence[end]) break;
        }
        int j;
        for (j = i; j < end; j++) {
            if(sequence[j] < sequence[end]) return false;
        }
        boolean left=true;
        //根结点左子树不为空
        if(i>0){
            left=IsTreeBST(sequence, start, i-1);
        }
        boolean right=true;
        //根结点右子树不为空
        if(j<end-1){
            right= IsTreeBST(sequence, i, end-1);
        }
        return left&&right;
    }

}
