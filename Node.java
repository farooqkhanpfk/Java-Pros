// public class Linked_list {
import java.util.*;
public class Node{
    public int data;
    public Node next;
    public Node (int data){
        this.data=data;
        this.next=null;
    }
}





public class Main{
    private Node head;
    public boolean isEmpty(){
        return (head == null);
    }
   
   
public void insert(int data){
    Node newNode = new Node(data);
    if(head==null){
        head=newNode;
    }
    else{
        Node temp =head;
        while(temp.next != null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
  }  
 
 
 
 
  public void display(){
      if(isEmpty()){
          System.out.println("Nothing");
          return;
      }
      System.out.println("List is:");
      Node current = head;
      while(current != null){
          System.out.print(current.data + " ");
          current=current.next;
      }
      System.out.println();
  }
 
 
  public void reverse (){
      Node prev=null;
      Node temp=head;
      Node current=head;
      while(current != null){
          temp=current.next;
          current.next=prev;
          prev=current;
          current=temp;
      }
      head=prev;
  }
 
 
 
  public static void main (String[] args){
      Main List=new Main();
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      ArrayList <Integer> l =new ArrayList<>();
     
      for(int i=0;i<n;i++){
          l.add(sc.nextInt());
      }
     
      for(int i=0;i<l.size();i++){
          List.insert(l.get(i));
      }
     
      List.reverse();
      List.display();
   }
}
}
