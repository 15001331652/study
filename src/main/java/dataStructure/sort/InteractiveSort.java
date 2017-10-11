package dataStructure.sort;

/**
 * Created by renzengtao on 2017/10/9.
 */
public class InteractiveSort extends Sort {
    /**
     * 交换排序
     * 不稳定
     * @param elements
     */
    public static void sort(int[] elements) {
        for (int i = 0; i < elements.length - 1; i++) {
            for (int j = i + 1; j < elements.length; j++) {
                compareCount++;
                if (elements[j] < elements[i]) {
                    swap(elements, i, j);
                }
            }
            printArray(elements);
        }
    }


    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 6, 0, 9, 100, 78, 93, 88, 66, 51};
        sort(array);
        System.out.println("swap : " + Sort.swapCount);
        System.out.println("compare : " + Sort.compareCount);
    }
}
