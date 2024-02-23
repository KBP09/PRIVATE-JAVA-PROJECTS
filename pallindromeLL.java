import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.*;

public class pallindromeLL {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    void pallin(Node head){
        Node prevNode = head;
        Node currNode = head.next;
        while(currNode!=null){
            Node thirdNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = thirdNode;
        }
        head.next = null;
        head = prevNode;
    }
    public int[] arraycreate(Node head,int N){
        Node curNode = head;
        int arr[] = new int[N];
        int i = 0;
        while(curNode!=null && i<N){
            arr[i] = curNode.data;
            curNode = curNode.next;
            i++;
        }
        return arr;
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
        Node currNode = new Node(data);
        if(head == null){
            head = currNode;
            return;
        }
        Node curr = head;
        while(curr.next!=null){
            curr = curr.next;
        }
        curr.next = currNode;
    }
    boolean pallin_checker(int arr[],Node head){
        Node currNode = head;
        int i = 0;
        while(currNode!=null){
            if(currNode.data!=arr[i]){
                return false;
            }
            i++;
            currNode = currNode.next;
        }
        return true;
    }
    public static void main(String args[]){
        pallindromeLL list = new pallindromeLL();
        System.out.println("Enter the size of array");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 0;i<N;i++){
            int data = sc.nextInt();
            list.addLast(data);
        }
        int arr[] = new int[N];
        if(pallin_checker(arraycreate((head,N),)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
