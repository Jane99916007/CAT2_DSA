class LinkedList {
    private Node head;

    private static class Node{
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;

        }
    }

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while(current.next!=null){
            current = current.next;
        }
        current.next = newNode;
    }

    public void deleteFromBeginning(){
        if(head ==null){
            System.out.print("List is empty.Nothing to delete");
            return;
        }
        head = head.next;
    }

    public void display(){
        Node current = head;
        while(current!=null) {
            System.out.println(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[]args){
        LinkedList list = new LinkedList();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtBeginning(5);
        list.display();

        list.deleteFromBeginning();
        list.display();

        list.deleteFromBeginning();
        list.deleteFromBeginning();
        list.display();
    }
}