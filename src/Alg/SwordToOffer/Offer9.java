package Alg.SwordToOffer;

public class Offer9 {
    public static int Fib1 (int n){
        if(n==0){
            return 0;
        }else if (n==1){
            return 1;
        }else {
            return Fib1(n-1)+Fib1(n-2);
        }
    }




    public static long Fib2 (int n){
        long Fibone = 0;
        long Fibtwo = 1;
        long FibN = 0;
        int result[] = {1,2};
        if (n < 2){
            return result[n];
        }else {
            for (int i=2;i<=n;i++){
                FibN= Fibone+Fibtwo;
                Fibone = Fibtwo;
                Fibtwo = FibN;
            }
        }
        return FibN;
    }
}
