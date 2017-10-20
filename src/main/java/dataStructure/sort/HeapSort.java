package dataStructure.sort;

/**
 * Created by renzengtao on 2017/10/20.
 */
public class HeapSort extends Sort{



    /**
     * 堆排序
     * 不稳定
     * @param elements
     */
    public static void sort(int[] elements) {
        // 将待排序的序列构建成一个大顶堆
        for (int i = elements.length / 2; i >= 0; i--){
            heapAdjust(elements, i, elements.length);
        }

        // 逐步将每个最大值的根节点与末尾元素交换，并且再调整二叉树，使其成为大顶堆
        for (int i = elements.length - 1; i > 0; i--) {
            swap(elements, 0, i); // 将堆顶记录和当前未经排序子序列的最后一个记录交换
            heapAdjust(elements, 0, i); // 交换之后，需要重新检查堆是否符合大顶堆，不符合则要调整
        }
    }

    /**
     * 构建堆的过程
     * @param elements 需要排序的数组
     * @param i 需要构建堆的根节点的序号
     * @param n 数组的长度
     */
    private static void heapAdjust(int[] elements, int i, int n) {
        int child;
        int father;
        for (father = elements[i]; leftChild(i) < n; i = child) {
            child = leftChild(i);

            // 如果左子树小于右子树，则需要比较右子树和父节点
            if (child != n - 1 && elements[child] < elements[child + 1]) {
                child++; // 序号增1，指向右子树
            }

            // 如果父节点小于孩子结点，则需要交换
            if (father < elements[child]) {
                elements[i] = elements[child];
            } else {
                break; // 大顶堆结构未被破坏，不需要调整
            }
        }
        elements[i] = father;
    }

    // 获取到左孩子结点
    private static int leftChild(int i) {
        return 2 * i + 1;
    }

    public static void main(String[] args) {
        int[] arr = { 50, 10, 90, 30, 70, 40, 80, 60, 20 };
        System.out.println("排序之前：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // 堆排序
        sort(arr);

        System.out.println();
        System.out.println("排序之后：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


}
