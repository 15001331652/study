package dataStructure.sort;

/**
 * Created by renzengtao on 2017/10/9.
 */

/**
 * 链接：https://www.nowcoder.com/questionTerminal/eefff94cbd75427eb5b40a5fbb815c30
 来源：牛客网

 排序法	平均时间	    最差情形	    稳定度	    额外空间
 冒泡	O(n2)	    O(n2)	    稳定	         O(1)
 交换	O(n2)	    O(n2)	    不稳定        O(1)
 选择	O(n2)	    O(n2)	    不稳定        O(1)
 插入	O(n2)	    O(n2)	    稳定	         O(1)
 基数	O(logRB)	O(logRB)	稳定	         O(n)
 Shell	O(nlogn)	O(ns)1<s<2	不稳定        O(1)
 快速	O(nlogn)	O(n2)	    不稳定        O(logn)
 归并	O(nlogn)	O(nlogn)	稳定          O(n)
 */
public class BubbleSort extends Sort {

    /**
     * 冒泡排序
     * 稳定的
     * 比较次数交少，交换正常换
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
        int[] array = {1,2,3,4,6,5};
        sort(array);
        printArray(array);
        System.out.println("swap : " + Sort.swapCount);
        System.out.println("compare : " + Sort.compareCount);
    }
}
