public class BST<K extends Comparable<K>, V> {
    private Node root;

    // Node class representing a node in the binary search tree
    private class Node {
        private K key;
        private V val;
        private Node left, right;

        public Node(K key, V val) {
            this.key = key;
            this.val = val;
        }
    }
}