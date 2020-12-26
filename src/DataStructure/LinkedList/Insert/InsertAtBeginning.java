package DataStructure.LinkedList.Insert;

import DataStructure.LinkedList.Create.CreatingNode;

import java.util.Scanner;

public class InsertAtBeginning {
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
        newNode.next = head;
        head = newNode;
    }

    public static void main(String[] args) {
        InsertAtBeginning iab = new InsertAtBeginning();
        iab.head = new Node(11);
        Node second = new Node(22);
        Node third = new Node(33);

        iab.head.next = second;
        second.next = third;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a data to insert to the Linked list at the Beginning : ");
        int newData = sc.nextInt();

        iab.push(newData);

        Node h = iab.head;
        while (h != null) {
            System.out.println(h.data);
            h = h.next;
        }
    }

}
