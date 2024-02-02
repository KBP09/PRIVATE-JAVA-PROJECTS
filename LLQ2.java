import java.util.*;

public class LLQ2 {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next!=null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    void delVal25(){
        if(head==null){
            return;
        }
        Node currNode = head;
        Node prevNode = null;
        while(currNode!=null){
            if(currNode.data>=25){
                if(prevNode!=null){
                    prevNode.next = currNode.next;
                }else{
                    head = currNode.next;
                }
            }else{
                prevNode = currNode;
            }
            currNode = currNode.next;
        }
    }
    void printlist(){
        Node currNode  = head;
        if(head == null){
            return;
        }
        while(currNode!=null){
            System.out.print(currNode.data+"->");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        LLQ2 list = new LLQ2();
        int N = sc.nextInt();
        for(int i = 0;i<N;i++){
            int x = sc.nextInt();
            list.addLast(x);
        }
        list.delVal25();
        list.printlist();
    }
}
