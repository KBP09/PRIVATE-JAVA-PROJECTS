import java.util.*;
public class LLquestions {
    Node head;
    private int i;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    void addFirst(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }
    void addLast(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            return;
        }
        Node currNode = head;
        while(currNode.next!=null){
            currNode = currNode.next;
        }
        currNode.next = newnode; 
    }
    public int index_Finder(){
        Node first = head;
        while(first!=null){
            if(first.data==7){
                return i;
            }
            i++;
            first = first.next;
        }
        return 0;
    }
    void reverseIterate(){
        if(head == null || head.next == null){
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while(currNode!=null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }
    public static void main(String args[]){
        LLquestions list = new LLquestions();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 0;i<N;i++){
            int x = sc.nextInt();
            list.addLast(x);
        }
        System.out.println(list.index_Finder());
        sc.close();
    }
}