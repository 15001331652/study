package dataStructure.sort;

/**
 * Created by renzengtao on 2017/10/20.
 */
public class HeapSort extends Sort{
    
    public static void sort(int[] elements) {
        //初始化堆
        for (int i = elements.length / 2 - 1; i >= 0; i--) {
            heapAdjust(elements, elements.length, i);

        }
        //把堆上的第一个元素放数组的最后，最后放到第一个
        //通过长度的调节把最后一个干掉
        //从新再调整堆，因为除了顶部节点，都满足条件，所有只需要从头调整就好了
        for (int length = elements.length - 1; length >= 1; length--) {
            swap(elements,length,0);
            heapAdjust(elements, length, 0);
        }

    }

    /**
     * 调整堆
     * @param elements
     * @param length
     * @param k
     */
    public static void heapAdjust(int[] elements, int length, int k) {
        while ((k * 2) + 1 < length) {
            //先把左节小标点赋值给最大值
            int max = (k * 2) + 1;
            //如果右节点小标的值大于左节点的值，那么就把最大值给右节点
            if ((k * 2) + 2 < length && elements[(k * 2) + 2] > elements[(k * 2) + 1]) {
                max = (k * 2) + 2;
            }
            if (elements[k] > elements[max]) {
                break;
            }
            swap(elements, max, k);
            //如果经过交换了，那么可能影响交换过的节点下面的节点，所有要接着循环或递归
            k = max;
        }
    }

    public static void main(String[] args) {
        int[] elements = {1, 5, 0, 99, 100, 87,1111,222,33};
        sort(elements);
        printArray(elements);
    }

}
