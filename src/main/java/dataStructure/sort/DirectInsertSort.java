package dataStructure.sort;

/**
 * Created by renzengtao on 2017/10/11.
 */
public class DirectInsertSort  extends   Sort{

    /**
     * 直接插入排序
     * 前面是有序的，后面是无序的，把后面的一个个插入到前面元素移动
     * 稳定
     * 比较比冒泡和选择都少了很多，但是会产生反复的
     * 综合来说比选择和冒泡好
     * 越有序越优秀
     * @param elements
     */
    public static void sort(int[] elements) {
       for(int i = 1 ;i<elements.length;i++){
           compareCount++;
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
        int[] array = {1,2,3,4,6,5};
        sort(array);
        printArray(array);
        System.out.println("swap : " + Sort.swapCount);
        System.out.println("compare : " + Sort.compareCount);
    }

}
