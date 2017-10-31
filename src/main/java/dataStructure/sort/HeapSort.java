package dataStructure.sort;

import java.util.Arrays;

/**
 * Created by renzengtao on 2017/10/20.
 */
public class HeapSort extends Sort{
    /**
     * 堆排序
     * 不稳定
     * @param elements
     */
    public static void sort(int[] elements) {
        int i;
        for (i = elements.length / 2 - 1; i >= 0; i--) {// 构建一个大顶堆
            adjustHeap(elements, i, elements.length - 1);
        }
//      for (i = elements.length - 1; i >= 0; i--) {// 将堆顶记录和当前未经排序子序列的最后一个记录交换
//          int temp = elements[0];
//          elements[0] = elements[i];
//          elements[i] = temp;
//          adjustHeap(elements, 0, i - 1);// 将a中前i-1个记录重新调整为大顶堆
//      }
    }

    /**
     * 构建大顶堆
     */
    public static void adjustHeap(int[] elements, int i, int len) {
        int temp, j;
        temp = elements[i];
        for (j = 2 * i; j < len; j *= 2) {
            //比较孩子节点，找出最大值
            if (elements[j] < elements[j + 1])
                //j记录值较大的下标
                ++j;
            if (temp >= elements[j])
                break;
            elements[i] = elements[j];
            i = j;
        }
        elements[i] = temp;
    }


    public static void main(String[] args) {
        int elements[] = { 40,50,30,100,10,20,99};
        sort(elements);
        System.out.println(Arrays.toString(elements));
    }


}
