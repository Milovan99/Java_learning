package datastructure;

import java.util.LinkedList;

public class TheLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(34);

        CustomLinkedList ll = new CustomLinkedList();
        ll.insertFirst(3);
        ll.insertFirst(6);
        ll.insertFirst(12);
        ll.insertFirst(26);

        ll.insertLast(99);
        ll.insert(0,5);
        ll.display();
        System.out.println(ll.deleteFirst());
        ll.display();

        System.out.println(ll.deleteLast());
        ll.display();
        System.out.println(ll.delete(1));
        ll.display();
        System.out.println(ll.find(3));
    }
}

class CustomLinkedList{
    private Node head;
    private Node tail;

    private int size;

    public CustomLinkedList(){
        this.size=0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next=head;
        head=node;

        if(tail==null){
            tail=head;
        }
        size+=1;
    }

    public void insert(int val,int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }

        Node temp=head;
        for (int i = 1; i < index; i++) {
            temp=temp.next;
        }

        Node node = new Node(val,temp.next);
        temp.next=node;

        size++;

    }
    public void insertLast(int val){
        if (tail==null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next=node;
        tail=node;
        size+=1;
    }
    public void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.value + "->");
            temp=temp.next;
        }
        System.out.println("End");
    }


    public int deleteFirst(){
        int val = head.value;
        head=head.next;

        if(head==null){
            tail=null;

        }
        size--;
        return val;

    }

    public int deleteLast(){
        Node secondLast = get(size-2);
        int val=tail.value;
        tail=secondLast;
        tail.next=null;
        return val;

    }

    public int delete(int index){
        if(index==0){
            return deleteFirst();
        }
        if (index== size-1){
            return deleteLast();
        }

        Node previous = get(index-1);
        int val = previous.next.value;

        previous.next=previous.next.next;
        return val;

    }

    public Node get(int index){
        Node temp=head;
        for (int i = 0; i < index; i++) {
            temp=temp.next;
        }
        return temp;
    }

    public Node find(int value){
        Node temp=head;
        while (temp!=null){
            if (temp.value==value){
                return temp;
            }
            temp=temp.next;
        }
        return null;

    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value=value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}