package AllSort;

import static AllSort.Example.exch;
import static AllSort.Example.less;

public class Insertion {
    public static void sort(Comparable[] a){
        int N = a.length;//升序排列
        for(int i=0;i<N;i++){
            //将a[i]插入到a[i-1],a[i-2],a[i-3]..之中
            for (int j =i;j>0&&less(a[j],a[j-1]);j--)
                exch(a,j,j-1);
        }
    }
}
