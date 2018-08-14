package AllSort;

import edu.princeton.cs.algs4.StdOut;

public class Example {
    public static void sort(){}
    public static boolean less(Comparable v,Comparable w){
        return v.compareTo(w)<0;
    }
    public static void exch(Comparable[] a,int i,int j){
        Comparable t =a[i];
        a[i]=a[j];
        a[j]=t;
    }
    public static void show(Comparable[] a){
        for (int i =0; i<a.length;i++)
            StdOut.print(a[i]+" ");
        StdOut.println();
    }
//    public static void merge(Comparable[] a,int lo ,int mid,int hi){
//        int i = lo;
//        int j = mid+1;
//        for (int k=lo; k<=hi;k++)
//            aux[k] = a[k];
//        for (int k =lo; k<=hi;k++)
//            if (i>mid)                        a[k]=aux[j++];
//            else if (j>hi)                    a[k]=aux[i++];
//            else if (less(aux[j],aux[i]))     a[k]=aux[j++];
//            else                              a[k]=aux[i++];
//            //判断的四个条件 左半边用尽取右半边的元素  右半边用尽取左半边的元素 右半边的当前元素小于左半边的当前元素取右半边的元素以及右半边的当前
//        元素大于等于左半边的当前元素取左半边的元素
    }

