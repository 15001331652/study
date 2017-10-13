package dataStructure.sort;

/**
 * Created by renzengtao on 2017/10/13.
 */
public class ShellSort extends Sort {

    /**
     * 希尔排序
     * 希尔排序时间复杂度，希尔排序的时间复杂度与增量(即，步长gap)的选取有关。例如，当增量为1时，希尔排序退化成了直接插入排序，此时的时间复杂度为O(N²)，而Hibbard增量的希尔排序的时间复杂度为O(N3/2)。
     * 我觉准确的说法应该是在大于n 小于n的平方
     * @param elements
     */
    public static void sort(int[] elements) {
        int j = 0;
        int temp = 0;
        for (int increment = elements.length / 2; increment > 0; increment /= 2) {
            System.out.println("increment:" + increment);
            for (int i = increment; i < elements.length; i++) {
//                 System.out.println("i:" + i);
                temp = elements[i];
                for (j = i - increment; j >= 0; j -= increment) {
//                     System.out.println("j:" + j);
//                     System.out.println("temp:" + temp);
//                     System.out.println("data[" + j + "]:" + elements[j]);
                    if (temp < elements[j]) {
                        elements[j + increment] = elements[j];
                    } else {
                        break;
                    }
                }
                elements[j + increment] = temp;
            }
        }
    }


    public static void main(String[] args) {
        int[] array ={ 26, 53, 67, 48, 57, 13, 48, 32, 60, 50 };
        sort(array);
//        printArray(array);
//        System.out.println("swap : " + Sort.swapCount);
//        System.out.println("compare : " + Sort.compareCount);
    }
}
