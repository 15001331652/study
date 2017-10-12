package dataStructure.sort;

/**
 * Created by renzengtao on 2017/10/10.
 */
public class SelectionSort extends Sort {

    /**
     * 选择排序
     * 不稳定的，5 8 5 2 9
     * 交换少了，比较多了
     * 综合来说比选择好
     * @param elements
     */
    public static void sort(int[] elements) {
        for (int i = 0; i < elements.length; i++) {
            int min = i;
            for (int j = i + 1; j < elements.length; j++) {
                compareCount++;
                if (elements[i] > elements[j]) {
                    min = j;
                }
            }
            swap(elements,i,min);
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
