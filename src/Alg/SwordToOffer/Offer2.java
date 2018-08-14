package Alg.SwordToOffer;
//在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
// 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
public class Offer2 {
    public static boolean find(int arr[][], int key) {
        int row = 0;
        int column = arr[0].length - 1; //从左下角开始搜索
        while (row < arr.length && column >=0) {
            if (arr[row][column] == key) {
                return true;
            }
            else if (arr[row][column] < key) {
                row++;
            } else {
                column--;
            }
        }

        return false;
    }
        public static void main (String[] args) {
            int array[][]=new int[4][4];
                     array[0][0]=1;
                     array[0][1]=2;
                     array[0][2]=8;
                     array[0][3]=9;
                     array[1][0]=2;
                     array[1][1]=4;
                     array[1][2]=9;
                     array[1][3]=12;
                     array[2][0]=4;
                     array[2][1]=7;
                     array[2][2]=10;
                     array[2][3]=13;
                     array[3][0]=6;
                     array[3][1]=8;
                     array[3][2]=11;
                     array[3][3]=15;
             System.out.println(find(array, 7));
             System.out.println(find(array, 5));
                 }

}
