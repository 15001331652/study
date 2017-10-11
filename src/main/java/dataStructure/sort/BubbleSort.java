package dataStructure.sort;

/**
 * Created by renzengtao on 2017/10/9.
 */
public class BubbleSort extends Sort {

    /**
     * 冒泡排序
     * 稳定的
     * @param elements
     */
    public static void sort(int[] elements) {
        boolean flag = false;
        for (int i = 0; i < elements.length && flag == false; i++) {
            flag = true;
            for (int j = elements.length - 2; j >= i; j--) {
                Sort.compareCount++;
                if (elements[j + 1] < elements[j]) {
                    flag = false;
                    swap(elements, j + 1, j);
                }
            }
        }

    }

    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 6, 0, 9, 100, 78, 93, 88, 66, 51};
        sort(array);
        printArray(array);
        System.out.println("swap : " + Sort.swapCount);
        System.out.println("compare : " + Sort.compareCount);
    }
}