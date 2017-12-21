package dataStructure.leetcode;

/**
 * Created by renzengtao on 2017/12/18.
 */

import java.util.Arrays;
import java.util.LinkedList;

/**
 * 给你两个表示两个非负数字的链表。数字以相反的顺序存储，其节点包含单个数字。将这两个数字相加并将其作为一个链表返回。并且最后的链表也是相反的
 Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 Output: 7 -> 0 -> 8
 Explanation: 342 + 465 = 807.
 其实就是每个位一直加，然后尾差，注解进位和其中一个遍历完的场景
 */
public class l_2_AddTwoNumbers {


    static class LinkedNode<T>{
        LinkedNode<T> next;
        T value;
    }

    public static LinkedList addTwoNumbers(LinkedNode<Integer> l1, LinkedNode<Integer> l2) {
        Integer carry = 0;
        LinkedList<Integer> linkedList = new LinkedList();
        int i = 0;
        while (l1!=null||l2!=null){
            if(l1!=null){
                carry+=l1.value;
                l1=l1.next;
            }
            if(l2!=null){
                carry+=l2.value;
                l2=l2.next;
            }
            linkedList.add(carry%10);
            carry=carry/10;
        }
        return linkedList;
    }

    public static void main(String[] args) {

        LinkedNode<Integer> linkedNode =  new LinkedNode<Integer>();
        LinkedNode<Integer> linkedNode2 =  new LinkedNode<Integer>();
        linkedNode.value = 1;
        linkedNode.next = linkedNode2;
        linkedNode2.value = 3;

        LinkedList linkedList = addTwoNumbers(linkedNode,linkedNode2);
        System.out.println(Arrays.toString(linkedList.toArray()));
    }
}
