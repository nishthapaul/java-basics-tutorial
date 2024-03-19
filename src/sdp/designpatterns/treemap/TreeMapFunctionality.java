package sdp.designpatterns.treemap;

class Node<T> {
    T val;

    Node<T> left, right;

    public Node(T val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }

    public Node(T val, Node<T> left, Node<T> right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class TreeMapFunctionality {

    public static void main(String[] args) {
        Node<Integer> treeRoot1 = new Node<>(1);
        treeRoot1.left = new Node<>(20);
        treeRoot1.right = new Node<>(3);
        treeRoot1.left.left = new Node<>(40);
        treeRoot1.left.right = new Node<>(5);

        System.out.println("Original Tree");
        preOrder(treeRoot1);

        Function f = new StringFun();
        Node<String> treeRoot2 = mapTree(f, treeRoot1);

        System.out.println("String Fun");
        preOrder(treeRoot2);

        f = new StringDigitsFun();
        Node<String> treeRoot3 = mapTree(f, treeRoot1);

        System.out.println("String Digits Fun");
        preOrder(treeRoot3);
    }

    public static Node<String> mapTree(Function f, Node<Integer> treeRoot1) {
        if ( treeRoot1 != null ) {
            Node<String> root2 = new Node<>(f.apply(treeRoot1.val));
            root2.left = mapTree(f, treeRoot1.left);
            root2.right = mapTree(f, treeRoot1.right);
            return root2;
        }
        return null;
    }

    public static <T> void preOrder(Node<T> root) {
        if ( root != null ) {
            System.out.println(root.val);
            preOrder(root.left);
            preOrder(root.right);
        }
    }

}
