package DataStructure.LinkedList.Delete;

public class DeleteByKey {
    Node head;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public void delete(int key) {

        Node search = head;
        Node prev = null;
        while (search != null && search.data != key) {
            prev = search;
            search = search.next;
        }

        if (search == null) {
            System.out.println("Key not present ..");
            return;
        }

//        assert prev != null;
        prev.next = search.next;

    }

    public static void main(String[] args) {
        DeleteByKey dbk = new DeleteByKey();
        dbk.head = new Node(11);
        Node second = new Node(22);
        Node third = new Node(33);

        dbk.head.next = second;
        second.next = third;


        dbk.delete(228);

        Node val = dbk.head;
        while (val != null) {
            System.out.println(val.data);
            val = val.next;
        }
    }
}
