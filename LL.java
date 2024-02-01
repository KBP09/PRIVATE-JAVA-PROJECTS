public class LL{
    Node head;
    private int size;
    LL(){
        this.size=0;
    }
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }
    void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currnode = head;
        while(currnode.next != null){
            currnode = currnode.next; 
        }
        currnode.next = newNode;
    }
    void printList(){
        Node currNode = head;
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        while(currNode != null){
            System.out.print(currNode.data+"->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
    public void delListFirst(){
        if(head==null){
            System.out.println("The list is empty");
            return;
        }
        head = head.next;
        size--;
    }
    public void delListLast(){
        if(head==null){
            System.out.println("The list is empty");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }
        Node secondlast = head;
        Node last = head.next;
        while(last.next!=null){
            last = last.next;
            secondlast = secondlast.next;
        }
        secondlast.next = null;
    }
    public int getSize(){
        return size;
    }
    public static void main(String args[]){
        LL list = new LL();
        list.addFirst("is");
        list.addLast("a");
        list.addFirst("this");
        list.addLast("List");
        list.printList();
        list.delListFirst();
        list.delListLast();
        list.printList();
        System.out.println(list.getSize());
    }
}
