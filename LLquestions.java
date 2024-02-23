// import java.util.*;
// public class LLquestions {
//     Node head;
//     private int i;
//     class Node{
//         int data;
//         Node next;
//         Node(int data){
//             this.data = data;
//             this.next = null;
//         }
//     }
//     void addFirst(int data){
//         Node newnode = new Node(data);
//         if(head == null){
//             head = newnode;
//             return;
//         }
//         newnode.next = head;
//         head = newnode;
//     }
//     void addLast(int data){
//         Node newnode = new Node(data);
//         if(head == null){
//             head = newnode;
//             return;
//         }
//         Node currNode = head;
//         while(currNode.next!=null){
//             currNode = currNode.next;
//         }
//         currNode.next = newnode; 
//     }
//     public int index_Finder(){
//         Node first = head;
//         while(first!=null){
//             if(first.data==7){
//                 return i;
//             }
//             i++;
//             first = first.next;
//         }
//         return 0;
//     }
//     void reverseIterate(){
//         if(head == null || head.next == null){
//             return;
//         }
//         Node prevNode = head;
//         Node currNode = head.next;
//         while(currNode!=null){
//             Node nextNode = currNode.next;
//             currNode.next = prevNode;
//             prevNode = currNode;
//             currNode = nextNode;
//         }
//         head.next = null;
//         head = prevNode;
//     }
//     public Node recursiveRotate(Node head){
//         if(head == null || head.next == null){
//             return head;
//         }
//         Node newHead = recursiveRotate(head.next);
//         head.next.next = head;
//         head.next = null;
//         return newHead;
//     }
//     void printList(){
//         Node currNode = head;
//         if(head == null){
//             System.out.println("The list is empty");
//             return;
//         }
//         while(currNode != null){
//             System.out.print(currNode.data+"->");
//             currNode = currNode.next;
//         }
//         System.out.println("null");
//     }
//     public static void main(String args[]){
//         LLquestions list = new LLquestions();
//         Scanner sc = new Scanner(System.in);
//         int N = sc.nextInt();
//         for(int i = 0;i<N;i++){
//             int x = sc.nextInt();
//             list.addLast(x);
//         }
//         list.reverseIterate();
//         // list.head = list.recursiveRotate(list.head);
//         list.printList();
//         sc.close();

//     }
// }
class Solution {
    public static String reverseVowels(String s) {
        char c[] = s.toCharArray();
        for(int i = 0;i<c.length;i++){
            System.err.println(c[i]);
            if(isVowel(c[i])){
                for(int k = i+1;k<c.length;k++){
                    if(isVowel(c[k])){
                        char t = c[i];
                        c[i] = c[k];
                        c[k] = t;
                        break;
                    }
                }
            }
        }
        return String.valueOf(c);
    }
    public static boolean isVowel(char A){
        if(A=='a'||A=='A'||A=='e'||A=='E'||A=='i'||A=='I'||A=='o'||A=='O'||A=='u'||A=='U'){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        System.out.println(reverseVowels("race car"));
    }
}
