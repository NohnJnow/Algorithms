//package Alg.SwordToOffer;
//
//
//import java.util.ArrayList;
//
//public class Offer20 {
////    输入一个矩阵，按照从外向里以顺时针的顺组依次打印出每一个数字
//    public ArrayList<Integer> printMatrix (int[][] matrix){
//        ArrayList<Integer> result =new ArrayList<>();
//        if (matrix == null || matrix.length < 0 | matrix[0].length <0){
//            return result;
//        }
//        int rows = matrix.length;
//        int columns = matrix[0].length;
//        int start = 0;
//        //起始打印 外圈一圈
//        while (rows > 2*start && columns > 2*start){
//            result = printMatrixCicle(matrix,rows,columns,start.result);
//            start++;
//        }
//        return result;
//    }
//
//    private ArrayList<Integer> printMatrixCicle(int matrix[][],int rows,int columns,int start,ArrayList<Integer> result){
//        int endX=rows-1-start;
//        int endY=columns-1-start;
//        //从左到右打印一行
//        for(int i=start;i<=endY;i++){
//            result.add(matrix[start][i]);
//        }
//        //从上到下打印一列:至少需要两行,即终止行号需要大于起始行号
//        if(start<endX){
//            for(int i=start+1;i<=endX;i++){
//                result.add(matrix[i][endY]);
//            }
//        }
//        //从右到左打印一行,至少需要两行两列
//        if(start<endX&&start<endY){
//            for(int i=endY-1;i>=start;i--){
//                result.add(matrix[endX][i]);
//            }
//        }
//        //从下到上打印一列，至少需要三行两列
//        if(endX>start+1&&endY>start){
//            for(int i=endX-1;i>=start+1;i--){
//                result.add(matrix[i][start]);
//            }
//        }
//        return result;
//    }
//}