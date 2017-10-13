package dataStructure.sort;

/**
 * Created by renzengtao on 2017/10/9.
 */
public abstract class Sort {
    public static int compareCount = 0;

    public static int swapCount = 0;

    public static void swap(int[] elements,int i,int j){
        int temp = elements[i];
        elements[i] = elements[j];
        elements[j] = temp;
        swapCount++;
    }

    public static void printArray(int[] elements){
        System.out.print("[ ");
        for (int i=0;i<elements.length;i++){
            if(i!=elements.length-1){
                System.out.print(elements[i]+",");
            }else {
                System.out.print(elements[i]);
            }
        }
        System.out.print(" ]");
        System.out.println();
    }

}
