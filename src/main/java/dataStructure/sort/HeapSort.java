package dataStructure.sort;

/**
 * Created by renzengtao on 2017/10/20.
 */
public class HeapSort{
    static int N = 0;
    public static void main(String[] args) {
        int array[]={5,1,3,11,2,6,7,8,4,9,10,12};
        N = array.length;
        printArray(array);
        buildHeap(array);

        sort(array);
    }

    private static void sort(int[] array) {
        System.out.println("开始排序...");
        for(int i=N-1;i>=1;i--){
            exch(array,0,i);//交换根元素和尾元素
            adjustHeap(array,i,0);
        }
        System.out.println("排序完毕！结果如下：");
        printArray(array);
    }

    private static void buildHeap(int[] array) {
        System.out.println("开始构建堆...");
        //构建堆
        for(int i=(array.length-1)/2;i>=0;i--){
            //从最后一颗子树开始
            adjustHeap(array,array.length,i);
        }
        System.out.println("堆构建完毕！结果如下：");
        printArray(array);
    }

    private static void printArray(int[] array) {
        for(int n:array){
            System.out.print(n+",");
        }
        System.out.println("");
    }

    /**
     * Parent = (k-1)/2
     * Left = 2i+1;
     * Right = 2i+2;
     * @param a 数组
     * @param k 下标
     */
    private static void adjustHeap(int[] a,int length,int k){
        while(2*k+1 < length ){
            int left = 2*k+1;
            int max = left;
            if(left + 1 < length){
                int right = left+1;

                if(a[left]<a[right]){
                    max = right;
                }
            }
            if(a[max]<a[k]){
                break;
            }
            exch(a,k,max);
            printArray(a);
            k = max;
        }

    }


    private static void exch(int[] a,int i,int j){
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

}
