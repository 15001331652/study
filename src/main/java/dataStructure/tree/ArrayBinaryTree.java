package dataStructure.tree;

import java.util.Arrays;

/**
 * Created by renzengtao on 2017/9/26.
 */
public class ArrayBinaryTree<T> {
    private Object[] arr; // 用数组来存储树的所有节点
    private int deep; // 保存该树的深度
    private int size; // 数组大小
    private static final int DEFAULT_DEEP = 5; // 树的默认深度

    /**
     * 以默认的深度来创建二叉树
     */
    public ArrayBinaryTree() {
        this.deep = DEFAULT_DEEP;
        this.size = (int) Math.pow(2, deep) - 1; // Math.pow(2,deep)返回第一个参数的第二个参数次幂的值
        arr = new Object[size];
    }

    /**
     * 以指定深度来创建二叉树
     * @param deep
     */
    public ArrayBinaryTree(int deep) {
        this.deep = deep;
        this.size = (int) Math.pow(2, deep) - 1;
        arr = new Object[size];
    }

    /**
     * 以指定深度,指定根节点创建二叉树
     *
     * @param deep 树的深度
     * @param data 数据
     */
    public ArrayBinaryTree(int deep, T data) {
        this.deep = deep;
        this.size = (int) Math.pow(2, deep) - 1;
        arr = new Object[size];
        arr[0] = data; // 根节点
    }

    /**
     * 为指定节点添加子节点。
     *
     * @param index 需要添加子节点的父节点的索引
     * @param data 新子节点的数据
     * @param left 是否为左节点
     */
    public void add(int index, T data, boolean left) {
        if (arr[index] == null) {
            throw new RuntimeException(index + "处节点为空，无法添加子节点");
        }
        if (2 * index + 1 >= size) {
            throw new IndexOutOfBoundsException();
        }
        if (left) {
            arr[2 * index + 1] = data; // 添加左子节点
        } else {
            arr[2 * index + 2] = data; // 添加右子结点
        }
    }

    /**
     * 判断二叉树是否为空
     * @return
     */
    public boolean isEmpty() {
        return arr[0] == null; // 根据根元素来判断二叉树是否为空
    }

    /**
     * 返回根节点
     * @return
     */
    @SuppressWarnings("unchecked")
    public T getRoot() {
        return (T) arr[0];
    }

    /**
     * 返回指定节点（非根节点）的父节点
     * @param index
     * @return
     */
    @SuppressWarnings("unchecked")
    public T getParent(int index) {
        return (T) arr[(index - 1) / 2];
    }

    /**
     * 返回指定节点（非叶子）的左子节点，当左子节点不存在时返回null
     * @param index
     * @return
     */
    @SuppressWarnings("unchecked")
    public T getLeft(int index) {
        if (2 * index + 1 >= size) {
            throw new RuntimeException("该节点为叶子节点，无子节点");
        }
        return (T) arr[index * 2 + 1];
    }

    /**
     * 返回指定节点（非叶子）的右子节点，当右子节点不存在时返回null
     * @param index
     * @return
     */
    @SuppressWarnings("unchecked")
    public T getRight(int index) {
        if (2 * index + 1 >= size) {
            throw new RuntimeException("该节点为叶子节点，无子节点");
        }
        return (T) arr[index * 2 + 2];
    }

    /**
     * 返回该二叉树的深度。
     * @param index
     * @return
     */
    public int getDeep(int index) {
        return deep;
    }

    /**
     * 返回指定节点的位置。
     * @param data
     * @return
     */
    public int index(T data) {
        for (int i = 0; i < size; i++) { // 该循环实际上就是按广度遍历来搜索每个节点
            if (arr[i].equals(data)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 打印数组
     */
    public String toString() {
        return Arrays.toString(arr);
    }

    /**
     * 测试方法
     * @param args
     */
    public static void main(String[] args) {
        ArrayBinaryTree<String> binTree = new ArrayBinaryTree<String>(4, "根结点");
        binTree.add(0, "第二层右子节点", false); // 第一个参数为需要添加子节点的父节点的索引： 即根节点
        binTree.add(2, "第三层右子节点", false);
        binTree.add(6, "第四层右子节点", false);
        System.out.println(binTree);
    }

}
