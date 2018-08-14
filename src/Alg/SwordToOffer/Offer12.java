//package Alg.SwordToOffer;
//
//public class Offer12 {
//    /*
//     * 问题描述： 实现函数double power(double base,int exponent),求base的exponent
//     * 次方。不能使用库函数，同时不需要考虑大数问题。
//     */
//    public static double power(double base, int exponent) throws Exception{
//        double result = 0.0;
//        if (equals(base,0) && (exponent < 0)){
//            throw new Exception("无意义数据");
//        }
//        if (exponent == 0){
//            return  1.0;
//        }
//        if (exponent < 0 || exponent >0){
//            result = powerDo(base,exponent);
//        }
//        return result;
//    }
// public  static  double powerDo (double base,int exponent){
//        double result = 0.0;
//        if (exponent>0){
//        for (int i=0; i <exponent ; i++)
//            result = result * base;
//        }
//        if (exponent<0){
//            for (int i=0; i < -exponent ; i++)
//                 result = result * base;
//        }
//        return result;
// }
// public static boolean equals (double number1, double number2 ){
//        if (number1 - number2 < 0.00000001|| number1 - number2 >-0.00000001 ) {
//            return true;
//        }else
//        return false;
// }
//
// public static void main (String[] args) throws Exception{
//        Offer12 test = new Offer12();
//     System.out.println(test.power(3, 3));
//     System.out.println(test.power(3, 0));
//     System.out.println(test.power(2, -3));
//     System.out.println(test.power(0, 5));
//     System.out.println(test.power(0, 0));
//     System.out.println(test.power(0, -9));
// }
//}
