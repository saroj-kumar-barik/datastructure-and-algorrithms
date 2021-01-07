package DataStructure.LinkedList.Insert;

import java.util.Scanner;

public class InsertAtEnd {

    Node head;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public void push(int newData) {
        Node newNode = new Node(newData);
        if (head == null) {
            head = newNode;
        }
        // making the next of newNode as null as it is going to be the last node
        newNode.next = null;
        // traverse till  the end of the node
        Node last = head;
        while (last.next != null){
            // after iterating it will be in the last node
            last = last.next;
        }
        // assigning the last node the newNode
        last.next = newNode;
    }

    public static void main(String[] args) {
        InsertAtEnd iae = new InsertAtEnd();
        iae.head = new Node(11);
        Node second = new Node(22);
        Node third = new Node(33);

        iae.head.next = second;
        second.next = third;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a data to insert to the Linked list at the End : ");
        int newData = sc.nextInt();

        iae.push(newData);

        Node h = iae.head;
        while (h != null) {
            System.out.println(h.data);
            h = h.next;
        }
    }
}
