package AllSort;

import edu.princeton.cs.algs4.StdRandom;

import static AllSort.Example.exch;
import static AllSort.Example.less;

public class Quick {
    public static void sort(Comparable [] a)
    {
        StdRandom.shuffle(a);
        sort(a,0,a.length-1);
    }
    private static void sort(Comparable[] a,int lo, int hi)
    {
        if (hi<=lo)
            return;
        int j =partition(a,lo,hi);
        sort(a,lo,j-1);
        sort(a,j+1,hi);
    }

    private static int partition(Comparable[] a,int lo,int hi)
    {
        int i = lo, j = hi+1;//左右扫描指针
        Comparable v = a[lo];//切分元素
        while (true)
        {
            while (less(a[++i],v)) if (i==hi) break;
            while (less(v,a[--j])) if (j==lo) break;
            if (i>=j) break;
            exch(a,i,j);
        }
        exch(a,lo,j);//将v=a[j] 放入正确位置
        return j; //a[lo..j-1] <= a[j] <= a[j+1...hi]达成
    }
}
