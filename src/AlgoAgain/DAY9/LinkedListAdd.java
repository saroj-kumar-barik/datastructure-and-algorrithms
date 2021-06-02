package AlgoAgain.DAY9;

public class LinkedListAdd {
    public static void main(String[] args) {
        Node head = new Node(11);
        Node second = new Node(9);
        Node third = new Node(6);

        head.next = second;
        second.next = third;

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
    }
}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}
