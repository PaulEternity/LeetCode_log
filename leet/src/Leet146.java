import java.util.HashMap;
import java.util.Map;


public class Leet146 {
    class LRUCache {
        private static class Node {
            int key;
            int value;
            Node prev;
            Node next;
            Node(int k ,int v){
                key = k;
                value = v;
            }
        }
        private final int capacity;
        private final Node dummy = new Node(0, 0);
        private final Map<Integer, Node> map = new HashMap<>();

        public LRUCache(int capacity) {
            this.capacity = capacity;
            dummy.next = dummy;
            dummy.prev = dummy;
        }

        public int get(int key) {
            Node node = getNode(key);
            return node == null ? -1 : node.value;
        }

        public void put(int key, int value) {
            Node node = getNode(key);
            if(node != null){
                node.value = value;
                return;
            }
            node = new Node(key, value);
            map.put(key,node);
            pushTop(node);
            if (map.size() > capacity) {
                Node bottomNode = dummy.prev;
                map.remove(bottomNode.key);
                remove(bottomNode);
            }

        }
        private Node getNode(int key){
            if(!map.containsKey(key)){
                return null;
            }
            Node node = map.get(key);
            remove(node);
            pushTop(node);
            return node;
        }
        private void remove(Node node){
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }
        private void pushTop(Node node){
            node.prev = dummy;
            node.next = dummy.next;
            node.prev.next = node;
            node.next.prev = node;

        }
    }
}
