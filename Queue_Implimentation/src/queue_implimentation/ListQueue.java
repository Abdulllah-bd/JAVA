/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue_implimentation;

/**
 *
 * @author Mohammad Abdullah
 */
    public class ListQueue extends queue_implimentation{
    int size;
    Node front;
    Node rear;
    
    
    public ListQueue(){
        size = 0;
        front = null;
        rear = null;
    }
   public int size()
   {
     return size;
   } 
    
   public boolean isEmpty()
   {
     if (front==null)
     {
       return true;
     }
     else
     {
       return false;
     }
   }
    
    public void enqueue(Object o) throws QueueOverflowException
    {
      if (front==null)
      {
        Node mn = new Node (o,null);
        front=mn;
        rear=mn;
        size++;
      }
      else
      {
        Node mn = new Node (o,null);
        rear.next=mn;
        rear=mn;
        size++;
      }
    }
    
// Removes the item in the front of the queue, throwing the 
// QueueUnderflowException if the queue is empty.
    public Object dequeue() throws QueueUnderflowException
    {
      if (front == null)
      {
        throw new QueueUnderflowException();
      }
      else if (front==rear)
      {
        Node temp = front;
        front=null;
        rear=null;
        size--;
        return temp.val;
      }
      else
      {
        Node temp = front;
        temp.next=null;
        front=front.next;
        size--;
        return temp.val;
      }
    }

    public Object peek() throws QueueUnderflowException{
      if(front == null){
        throw new QueueUnderflowException();
      }
      return front.val;
    }

    public String toString(){
      String s=" " ;
      for(Node n=front;n!=null;n=n.next){
        s=s+n.val+" ";
      }
      return "[" + s + "]";
    }
    
    public Object[] toArray(){
    int i=0;
    Object []a = new Object[size];
    for(Node n=front;n!=null;n=n.next){
    a[i]=n.val;
    i++;
    }
    return a;   
    }

    public int search(Object o)
    {
      Node n = front;
      for (int i=0;i<size;i++)
      {
        if (o.equals(n.val))
        {
          return i;
        }
        n=n.next;
      }
      return -1;
    }
}