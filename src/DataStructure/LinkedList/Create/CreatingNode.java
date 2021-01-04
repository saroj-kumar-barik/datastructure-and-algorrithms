package DataStructure.LinkedList.Create;

public class CreatingNode {
    Node head;

    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        CreatingNode cn = new CreatingNode();
        cn.head = new Node(11);
        Node second = new Node(22);
        Node third = new Node(33);

        cn.head.next = second;
        second.next= third;
        Node h = cn.head;
        while (h != null){
            System.out.println(h.data);
            h = h.next;
        }
    }
}
