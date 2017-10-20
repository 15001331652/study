package dataStructure.tree;

/**
 * Created by renzengtao on 2017/9/26.
 */
public class XianSuoTree {

    //节点存储结构
    static class Node {
        String data;        //数据域
        Node left;          //左指针域
        Node right;         //右指针域
        boolean isLeftThread = false;   //左指针域类型  false：指向子节点、true：前驱或后继线索
        boolean isRightThread = false;  //右指针域类型  false：指向子节点、true：前驱或后继线索

        Node(String data) {
            this.data = data;
        }
    }

    /**
     * 通过数组构造一个二叉树（完全二叉树）
     *
     * @param array
     * @param index
     * @return
     */
    static Node createBinaryTree(String[] array, int index) {
        Node node = null;
        if (index < array.length && array[index] != null) {
            node = new Node(array[index]);
            node.left = createBinaryTree(array, index * 2 + 1);
            node.right = createBinaryTree(array, index * 2 + 2);
        }
        return node;
    }

    /**
     * 中序遍历
     *
     * @param node
     */
    public static void inOrderTravese(XianSuoTree.Node node) {
        if (node != null) {
            inOrderTravese(node.left);
            System.out.print(node.data + "-");
            inOrderTravese(node.right);
        }
    }


    public static void main(String[] args) {
        String[] array = {"10", "20", "8", "25", "15", "9", "4"};
        Node root = createBinaryTree(array, 0);
        System.out.print("中序 ： ");
        inOrderTravese(root);
    }


}
