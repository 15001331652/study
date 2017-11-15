package dataStructure.objectTest;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by renzengtao on 2017/11/14.
 */
public class QueueTest {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        queue.offer("1");
        queue.offer("2");
        queue.offer("3");
        System.out.println(Arrays.toString(queue.toArray()));
        queue.poll();

        System.out.println(Arrays.toString(queue.toArray()));
    }
}
