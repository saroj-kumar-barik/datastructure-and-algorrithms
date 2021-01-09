package DataStructure.LinkedList.Insert;

import java.util.Scanner;

public class InsertAfterGivenNode {
    Node head;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public void push(Node prvNode,int newData){
        Node newNode = new Node(newData);
        if (prvNode == null){
            System.out.println("previous node can not be null");
        }
        // logic to insert a nweNode between two nodes
        newNode.next = prvNode.next;
        prvNode.next = newNode;
    }

    public static void main(String[] args) {
        InsertAfterGivenNode iab = new InsertAfterGivenNode();
        iab.head = new Node(11);
        Node second = new Node(22);
        Node third = new Node(33);

        iab.head.next = second;
        second.next = third;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a data to insert after second node : ");
        int newData = sc.nextInt();

        iab.push(second, newData);

        Node h = iab.head;
        while (h != null) {
            System.out.println(h.data);
            h = h.next;
        }
    }
}
