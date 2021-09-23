public class ReverseLinkedList {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        System.out.println(node1);
        node1 = reverse(node1);
        System.out.println(node1);

    }

    private static Node reverse(Node node1) {
        Node current = null;
        Node previous= null;
        while(node1 != null){
            previous = current;
            current = node1;
            node1 = node1.getNext();
            current.setNext(previous);

        }
        System.out.println(current);
        return current;


    }
}

class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
