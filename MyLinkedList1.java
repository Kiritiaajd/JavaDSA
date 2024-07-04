public class MyLinkedList1 {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }// add - first , last 
    private Node head;
public void addFirst(int data ){
    Node newNode = new Node(data);
    if(head == null){
        head = newNode;
        return;
    }
     newNode.next = head;
     head = newNode;

}
 
public void addlast(int data){
  Node newNode= new Node(data);
 
  if(head == null){
    head = newNode;
    return;
}
    newNode= head;
  while(ptr.next!= null){
    ptr=ptr.next;
  }
    ptr.next = newNode;

}
    public static void main(String args[]){
           MyLinkedList1 list = new MyLinkedList1();
               list.addFirst(10);
               list.addFirst(20);

    }
}
