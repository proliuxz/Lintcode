import Util.Node;

public class S456 {
    public Node node;

    public void copyValue(Node obj) {
        // copy value from obj to node
        if (obj == null) {
            return;
        }
        if (node == null) {
            node = new Node(obj.val);
        }
        node.val = obj.val;
    }

    public void copyReference(Node obj) {
        // copy reference from obj to node
        node = obj;
    }
}
