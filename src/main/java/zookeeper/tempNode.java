package zookeeper;

import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooDefs.Ids;
import org.apache.zookeeper.ZooKeeper;


public class tempNode {
    public static void main(String[] args) throws Exception {
        // 创建一个Zookeeper实例，第一个参数为目标服务器地址和端口，第二个参数为Session超时时间，第三个为节点变化时的回调方法
        ZooKeeper zk = new ZooKeeper("bigdata03:2181", 30000, new Watcher() {
            // 监控所有被触发的事件
            public void process(WatchedEvent event) {
                // dosomething
                System.out.println("watcher event fire...");
            }
        });

        // 创建一个节点root，数据是mydata,不进行ACL权限控制，节点为永久性的(即客户端shutdown了也不会消失)
        zk.create("/ztr/test1", "test".getBytes(), Ids.OPEN_ACL_UNSAFE, CreateMode.EPHEMERAL);
        zk.close();
    }
}
