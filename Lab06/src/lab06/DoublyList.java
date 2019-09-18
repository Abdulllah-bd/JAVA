/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab06;

/**
 *
 * @author 14321005
 */
public class DoublyList{
    public Node head;
    
    
    /* First Constructor:
     * Creates a linked list using the values from the given array. head will refer
     * to the Node that contains the element from a[0]
     */ 
    public DoublyList(Object [] a){
        head=new Node(null,null,null);
            Node tail=head;
        for(int i=0;i<a.length;i++){
            Node n=new Node(a[i],null,null);
            n.prev=tail;
            tail.next=n;
            tail=n;
        }
        tail.next=head;
        head.prev=tail;
    }
    
    /* Second Constructor:
     * Sets the value of head. head will refer
     * to the given LinkedList
     */
    public DoublyList(Node h){
        head = h;
    }
    
    /* Counts the number of Nodes in the list */
    public int countNode(){
        int c=0;
        for(Node n=head.next;n!=head;n=n.next){
            c++;
        }
        
        return c; // please remove this line!
    }
    
    /* prints the elements in the list */
    public void forwardprint(){
        Node n;
        for(n=head.next;n!=head;n=n.next){
            System.out.print(n.element+" ");
        }
        System.out.println("");
    }
    
    public void backwardprint(){
        Node n=null;
        for(n=head.prev;n!=head;n=n.prev){
            System.out.print(n.element+" ");
        }
        System.out.println("");
    }
    
    
    // returns the reference of the Node at the given index. For invalid index return null.
    public Node nodeAt(int idx){
        if(idx==-1){
            return head;
        }
        else{Node h=head.next;
        
        for(int i=0;i<idx;i++){
            h=h.next;
        }
        
        return h; 
        }
    }
    
    
    
    /* returns the index of the Node containing the given element.
     if the element does not exist in the List, return -1.
     */
    public int indexOf(Object elem){
        Node n;
        int c=0;
        for(n=head.next;n!=head;n=n.next){
            
            if(n.element.equals(elem)){
                return c;
            }
            c++;
        }
        return -1; // please remove this line!
    }
    
    
    
    /* inserts Node containing the given element at the given index
     * Check validity of index.
     */
    public void insert(Object elem, int idx){
        Node m=new Node(elem,null,null);
        Node suc=nodeAt(idx);
        Node prev=nodeAt(idx-1);
        m.prev=prev;
        m.next=suc;
        prev.next=m;
        suc.prev=m;
        
    }
    
    
    
    
    /* removes Node at the given index. returns element of the removed node.
     * Check validity of index. return null if index is invalid.
     */
    public Object remove(int index){
        Node n=nodeAt(index);
        Node suc=nodeAt(index+1);
        Node prev=nodeAt(index-1);
        prev.next=suc;
        suc.prev=prev;
        return n.element; // please remove this line!
    }
    
    
    
}