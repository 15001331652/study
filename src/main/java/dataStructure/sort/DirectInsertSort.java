package dataStructure.sort;

/**
 * Created by renzengtao on 2017/10/11.
 */
public class DirectInsertSort  extends   Sort{

    /**
     * 直接插入排序
     * @param elements
     */
    public static void sort(int[] elements) {
        for (int i = 1; i < elements.length; i++) {
            int currentNumber = elements[i];
            int j = i - 1;
            while (j >= 0 && elements[j] > currentNumber) {
                compareCount++;
                elements[j + 1] = elements[j];
                j--;
            }
            elements[j + 1] = currentNumber;
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
