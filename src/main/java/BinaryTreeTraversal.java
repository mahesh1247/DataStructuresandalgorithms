import java.util.function.Consumer;

public class BinaryTreeTraversal {


    public static void main(String[] args) {
        NodeElement leftleftNode2 = new NodeElement(3, null, null);
        NodeElement rightLeftNode2 = new NodeElement(9, null, null);
        NodeElement rightRightNode2 = new NodeElement(13, null, null);
        NodeElement leftNode1 = new NodeElement(5, leftleftNode2, null);
        NodeElement rightNode1 = new NodeElement(10, rightLeftNode2, rightRightNode2);
        NodeElement rootNode = new NodeElement(8, leftNode1, rightNode1);

        System.out.println("Preorder Elements are :: ");
        preorder(rootNode);
        System.out.println();
        System.out.println("Inorder Elements are :: ");
        inOrder(rootNode);
        System.out.println();
        System.out.println("Postorder Elements are :: ");
        postOrder(rootNode);

    }

    private static void inOrder(NodeElement rootNode) {
        if (null != rootNode) {

            rotateLeft(rootNode, BinaryTreeTraversal::inOrder);
            System.out.print(" " + rootNode.data);
            rotateRight(rootNode, BinaryTreeTraversal::inOrder);
        }
    }


    private static void rotateRight(NodeElement node, Consumer<NodeElement> consumer) {
        consumer.accept(node.right);
    }

    private static void rotateLeft(NodeElement node, Consumer<NodeElement> consumer) {
        consumer.accept(node.left);
    }

    private static void postOrder(NodeElement rootNode) {
        if (null != rootNode) {

            rotateLeft(rootNode, BinaryTreeTraversal::postOrder);
            rotateRight(rootNode, BinaryTreeTraversal::postOrder);
            System.out.print(" " + rootNode.data);
        }
    }

    private static void preorder(NodeElement rootNode) {
        if (null != rootNode) {
            System.out.print(" " + rootNode.data);
            rotateLeft(rootNode, BinaryTreeTraversal::preorder);

            rotateRight(rootNode, BinaryTreeTraversal::preorder);
        }
    }

}

class NodeElement {
    int data;
    NodeElement left;
    NodeElement right;

    public NodeElement(int data, NodeElement left, NodeElement right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public NodeElement getLeft() {
        return left;
    }

    public void setLeft(NodeElement left) {
        this.left = left;
    }

    public NodeElement getRight() {
        return right;
    }

    public void setRight(NodeElement right) {
        this.right = right;
    }
}