package datastructure.singlylinkedlist;

public class MainLinkedList {
    public static void main(String[] args) {

    }
}

class LinkedList{
    Node head;

    class Node{
        int data;
        Node next;

        Node(int val){
            data=val;
            next=null;
        }
    }

    //Function is adding Node at front of Linked List

    public void push(int val){
        //Creating new node
        Node pocetak = new Node(5);
        //Linking node to currently head of Linked list
        pocetak.next=head;
        //Making new node head of Linked ist
        head=pocetak;
    }

    //Inserts a new node after the given prev_node

    public void insertAfter(int val,Node node){
        if (node == null) {
            System.out.println(
                    "The given previous node cannot be null");
            return;
        }

        //Create node
        Node newNode=new Node(val);
        // Make next of new Node as next of prev_node
        newNode.next=node.next;
        //make next of prev_node as new_node
        node.next=newNode;

    }
}

