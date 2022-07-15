package danh_sach.thuc_hanh.LinkedList;

import danh_sach.bai_tap.MyLinkedListTest;

import javax.xml.soap.Node;

public class MyLinkedList {
    private Node head;
    private int numNodes;
    public MyLinkedList(Object data){
        head = new Node(data);
    }

    public void addLast(MyLinkedListTest.Person van_nam) {
    }

    public class Node{
        public Node next;
        public Object data;

        public Node(Node next) {
            this.next = next;
        }

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }
    public void add(int index, Object data) {
        Node temp = head;
        Node holder;

        for(int i=0; i < index-1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }
    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }
    public Node get(int index){
        Node temp=head;
        for(int i=0; i<index; i++) {
            temp = temp.next;
        }
        return temp;
    }
    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }


}