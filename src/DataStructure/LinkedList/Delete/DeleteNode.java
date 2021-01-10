package DataStructure.LinkedList.Delete;

public class DeleteNode {
    Node head;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public void push(Node node) {

        Node search = head;
        while (search.next == node) {
            search.next = node.next;
        }
    }

    public static void main(String[] args) {
        DeleteNode iab = new DeleteNode();
        iab.head = new Node(11);
        Node second = new Node(22);
        Node third = new Node(33);
        Node forth = new Node(44);

        iab.head.next = second;
        second.next = third;
        third.next = forth;

        iab.push(second);

        Node val = iab.head;
        while (val != null) {
            System.out.println(val.data);
            val = val.next;
        }
    }
}
