package dataStructure.mock;

import java.util.Arrays;

/**
 * Created by renzengtao on 2017/11/6.
 * 两个有序的数组合并成一个有序的数组
 */
public class MergeTwoSortedArrays {
    public static int[] merge(int[] a, int[] b) {
        int lena = a.length;
        int lenb = b.length;
        int[] c = new int[lena + lenb];
        int i = 0, j = 0, k = 0;//分别代表数组a ,b , c 的索引
        while (i < lena && j < lenb) {
            if (a[i] < b[j])
                c[k++] = a[i++];
            else
                c[k++] = b[j++];
        }
        while (i < lena)
            c[k++] = a[i++];
        while (j < lenb)
            c[k++] = b[j++];
        return c;
    }

    public static void main(String[] args) {
        int[] c = merge(new int[]{3,11,12}, new int[]{0, 2, 4, 5,
                6, 7, 8});
        System.out.println(Arrays.toString(c));
    }



}
