package dataStructure.sort;

/**
 * Created by renzengtao on 2017/10/13.
 */
public class ShellSort extends Sort {

    /**
     * 希尔排序
     * 希尔排序时间复杂度，希尔排序的时间复杂度与增量(即，步长gap)的选取有关。例如，当增量为1时，希尔排序退化成了直接插入排序，此时的时间复杂度为O(N²)，而Hibbard增量的希尔排序的时间复杂度为O(N3/2)。
     * 如果是一直除以2的话，那可能就是nlogn
     * 我觉准确的说法应该是在大于n 小于n的平方，据说有希尔排序的实际复杂度不能准确证明，所以不用关心
     *
     * @param elements
     */
    public static void sort(int[] elements) {
        int j = 0;
        int temp = 0;
        for (int increment = elements.length / 2; increment > 0; increment /= 2) {
            for (int i = increment; i < elements.length; i++) {
                temp = elements[i];
                for (j = i - increment; j >= 0; j -= increment) {
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

//    public static void Test(int[] elements) {
//        for (int increment = elements.length / 2; increment > 0; increment = elements.length / 2) {
//            for (int i = increment; i < elements.length; i++) {
//                if (elements[])
//            }
//        }
//    }

    public static void main(String[] args) {
        int[] array = {26, 53, 67, 48, 57, 13, 48, 32, 60, 50};
        sort(array);
        printArray(array);
//        System.out.println("swap : " + Sort.swapCount);
//        System.out.println("compare : " + Sort.compareCount);
        System.out.println(1 / 2);
    }
}
