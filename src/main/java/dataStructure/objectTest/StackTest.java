package dataStructure.objectTest;

import java.util.Enumeration;
import java.util.Stack;

/**
 * Created by renzengtao on 2017/11/14.
 */
public class StackTest {
    public static void main(String[] args) {
        Stack stack = new Stack(); // 创建堆栈对象
        stack.push(new Integer(1));
        stack.push(2); //向 栈中 压入
        stack.push(3); //向 栈中 压入
        printStack(stack);
        stack.pop();
        printStack(stack);
    }

    private static void printStack(Stack<Integer> stack ){
        if (stack.empty())
            System.out.println("堆栈是空的，没有元素");
        else {
            System.out.print("堆栈中的元素：");
            Enumeration items = stack.elements(); // 得到 stack 中的枚举对象
            while (items.hasMoreElements()) //显示枚举（stack ） 中的所有元素
                System.out.print(items.nextElement()+" ");
        }
        System.out.println(); //换行
    }
}
