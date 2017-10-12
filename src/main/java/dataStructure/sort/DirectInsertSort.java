package dataStructure.sort;

/**
 * Created by renzengtao on 2017/10/11.
 */
public class DirectInsertSort  extends   Sort{

    /**
     * 直接插入排序
     * 前面是有序的，后面是无序的，把后面的一个个插入到前面
     * @param elements
     */
    public static void sort(int[] elements) {
       for(int i = 1 ;i<elements.length;i++){
           if(elements[i] < elements[i-1]){
               int tmp = elements[i];
               int j = i-1;
               for(j = i-1;j>=0&&elements[j] > tmp ;j--){
                   elements[j+1] = elements[j];
                   printArray(elements);
               }
               elements[j+1] = tmp;
           }
       }
    }

    public static void main(String[] args) {
        int[] array = {1,3,4,2};
        sort(array);
        printArray(array);
        System.out.println("swap : " + Sort.swapCount);
        System.out.println("compare : " + Sort.compareCount);
    }

}
