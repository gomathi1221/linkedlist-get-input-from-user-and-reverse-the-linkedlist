import java.util.*;
class Node{
    int data;
    Node next;
   public Node(int data){
       this.data=data;
       this.next=null;
   }
   
}
class Main{
   
    public static void display(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
        System.out.print("null");
    }
    public static Node reverse(Node head){
        Node curr=head;
        Node prev=null;
        Node nextnode;
        while(curr!=null){
            nextnode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextnode;
        }
       return prev;
        
    }

   
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int na=sc.nextInt();
       int[] arr=new int[na];
       for(int i=0;i<na;i++){
           arr[i]=sc.nextInt();
       }
       Node head=null;
           Node tail=null;
       for(int i=0;i<na;i++){
           Node n=new Node(arr[i]);
           
           if(head==null&&tail==null){
               head=n;
               tail=n;
           }
           else{
               tail.next=n;
               tail=n;
           }
       }
       display(head);
       head=reverse(head);
       display(head);
    }
   }

