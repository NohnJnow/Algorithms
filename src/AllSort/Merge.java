//package AllSort;
//
//import static AllSort.Example.merge;
//
//public class Merge {
//    private static Comparable[] aux;
//
//    public static void sort (Comparable []a)
//    {
//        aux = new Comparable[a.length];
//        sort(a,0,a.length-1);
//    }
//    private static void sort(Comparable[] a,int lo,int hi){
//        if (hi <= lo) return;
//        int mid = lo+(hi-lo)/2;
//        sort(a,lo,mid);
//        sort(a,mid+1,hi);
//            merge(a,lo,mid,hi);
//    }
//}
