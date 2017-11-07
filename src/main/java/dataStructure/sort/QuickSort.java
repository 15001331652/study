package dataStructure.sort;

/**
 * Created by renzengtao on 2017/11/7.
 */
public class QuickSort extends Sort {
    public static void sort(int[] elements) {
        qsort(elements,0,elements.length-1);
    }


    public static void qsort(int[] elements,int low,int high){
        if(low < high){
            int pivot = partition(elements,low,high);
            qsort(elements,low,pivot-1);
            qsort(elements,pivot+1,high);
        }
    }

    public static int partition(int[] elements, int low, int high) {
        int pivot = elements[low];
        while (low < high) {
            if (low < high && elements[high] >= pivot) {
                high--;
            }
            elements[low] = elements[high];
            if (low < high && elements[low] <= pivot){
                low++;
            }
            elements[high] = elements[low];
        }
        elements[low] = pivot;
        return low;
    }

    public static void main(String[] args) {
        int a[] = {5,1,3,8,9};
        sort(a);
        printArray(a);
    }
}
