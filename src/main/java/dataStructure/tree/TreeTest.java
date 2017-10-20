package dataStructure.tree;

/**
 * Created by renzengtao on 2017/9/25.
 */
public class TreeTest {

    public static class Node {
        private int data;
        private Node leftNode;
        private Node rightNode;

        public Node(int data, Node leftNode, Node rightNode) {
            this.data = data;
            this.leftNode = leftNode;
            this.rightNode = rightNode;
        }
        public Node(int data) {
            this.data = data;
            this.leftNode = leftNode;
            this.rightNode = rightNode;
        }
    }

    private Node root = null;

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    /**
     * 根据数组创建树
     * @param array
     * @param index
     * @return
     */
    public TreeTest.Node createBinaryTree(Integer[] array, int index) {
        TreeTest.Node node = null;
        if (index < array.length && array[index] != null) {
            node = new TreeTest.Node(array[index]);
            node.leftNode = createBinaryTree(array, index * 2 + 1);
            node.rightNode = createBinaryTree(array, index * 2 + 2);
        }
        return node;
    }

    /**
     * 前序遍历
     *
     * @param node
     */
    public void preOrderTravese(Node node) {
        if (node != null) {
            System.out.print(node.data + "-");
            preOrderTravese(node.leftNode);
            preOrderTravese(node.rightNode);
        }
    }

    /**
     * 中序遍历
     *
     * @param node
     */
    public void inOrderTravese(Node node) {
        if (node != null) {
            inOrderTravese(node.leftNode);
            System.out.print(node.data + "-");
            inOrderTravese(node.rightNode);
        }
    }

    /**
     * 后序遍历
     *
     * @param node
     */
    public void postOrderTraversal(Node node) {  //后序遍历
        if (node != null) {
            postOrderTraversal(node.leftNode);
            postOrderTraversal(node.rightNode);
            System.out.print(node.data + "-");
        }

    }

    /**
     * 查找，非递归
     * @param value
     * @return
     */
    public boolean search(int value) {
        Node node = root;
        while (node.data != value) {
            if (node.data < value) {
                node = node.leftNode;
            } else {
                node = node.rightNode;
            }
            if(node == null){
                return false;
            }
        }
        return true;
    }


    /**
     * 查找，递归
     * @param value
     * @param node
     * @return
     */
    public Node search(int value,Node node){
        if(node==null){
            return null;
        }
        if(node.data < value){
            return search(value,node.leftNode);
        }else if(node.data > value){
            return search(value,node.rightNode);
        }else{
            return node;
        }
    }

    /**
     * 插入
     * @param node
     * @param inode
     */
    public void insert(Node node,Node inode){
        if(node.data < inode.data){
            if(node.leftNode == null ){
                node.leftNode = inode;
            }else{
                insert(node.leftNode,inode);
            }
        }else if(node.data > inode.data){
            if(node.rightNode == null){
                node.rightNode = inode;
            }else{
                insert(node.rightNode,inode);
            }
        }
    }

    /**
     * 最大值
     * @param node
     */
    public Node max(Node node){
        if(node.leftNode == null){
            return node;
        }
        return max(node.leftNode);
    }

    /**
     * 最小值
     * @param node
     */
    public Node min(Node node){
        if(node.rightNode == null){
            return node;
        }
        return min(node.rightNode);
    }

    public static void main(String[] args) {
        TreeTest treeTest =  new TreeTest();
        Integer[] array = {10, 20, 8, 25, 15, 9, 4};
        TreeTest.Node root = treeTest.createBinaryTree(array, 0);
        System.out.print("前序 ： ");
        treeTest.preOrderTravese(root);
        System.out.println();
        System.out.print("中序 ： ");
        treeTest.inOrderTravese(root);
        System.out.println();
        System.out.print("后序 ： ");
        treeTest.postOrderTraversal(root);
        System.out.println();

        Node searchNode = treeTest.search(1000,root);
        if(searchNode != null){
            System.out.println("搜索结构 ： "+searchNode.data);
        }

        System.out.println("最大值 : " + treeTest.max(root).data);
        System.out.println("最小值 : " + treeTest.min(root).data);
        Node node7 = new Node(100, null, null);
        treeTest.insert(root,node7);

        System.out.println();
        System.out.print("中序 ： ");
        treeTest.inOrderTravese(root);
    }

}
