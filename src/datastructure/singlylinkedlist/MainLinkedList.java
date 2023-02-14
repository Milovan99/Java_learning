package datastructure.singlylinkedlist;

public class MainLinkedList {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.push(4);
        list.push(8);
        list.push(9);
        list.display();
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
        Node pocetak = new Node(val);
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

    public void append(int val){
        if(head==null){
            head=new Node(val);
            return;
        }

        Node newNode=new Node(val);
        newNode.next=null;

        Node temp = head;
        while (temp.next!=null){
            temp=temp.next;
        }

        temp.next=newNode;
        return;
    }

    public int deleteFirst() {
        int val = head.data;
        head = head.next;
        return val;
    }

    public int deleteLast(){
        int val=head.data;
        Node last=head;
        Node prevLast=head;
        while (last.next!=null){
            prevLast=last;

            last=last.next;
            val=last.data;
        }
        prevLast.next=null;
        return val;
    }

    public int delete(int val){

        Node temp=head;
        int valeToReturn=head.data;
        if(temp.next!=null && temp.data==val){
            head=head.next;
            return valeToReturn;
        }else{
            head=null;
        }
        while (temp.next.data!=val){
                temp=temp.next;
        }
        valeToReturn=temp.next.data;

        temp.next=temp.next.next;

        return valeToReturn;
    }

    public int find(int val){
        Node temp= head;
        while (temp.data!=val){
            temp=temp.next;
        }
        return temp.data;
    }

    public void display(){
        Node temp=head;

        while (temp!=null){
        System.out.print(temp.data+"->");
        temp=temp.next;
        }
        System.out.println("Null");
    }

}

