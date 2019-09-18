/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ListStackTester;

/**
 *
 * @author 14321005
 */
public class ListStack implements Stack{
    int size;
    Node top;
    Node head;
    
    public ListStack(){
        size = 0;
        top = null;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        if(top==null)
            return true;
        else
            return false;
    }
    public void push(Object e) throws StackOverflowException{
        Node mn = new Node(e, null);
        mn.next = top;
        top = mn;
        size++;
    }
    public Object pop() throws StackUnderflowException{
        if(size==0){
            throw new StackUnderflowException();
        }
        Object val = top.val;
        Node n = top;  
        top = top.next;
        n.val = null;  
        n.next = null; 
        size--;
        return val;
    }
    public Object peek() throws StackUnderflowException{
        if(size==0){
            throw new StackUnderflowException();
        }
        Object val = top.val;
        return val;
    }
    public String toString(){
        String s = "[";
        for(Node n = top; n!=null; n=n.next){
            s =s + " " + n.val;
        }
        return s+" ]";
    }
    public Object[] toArray(){
        Object [] a = new Object[size];
        int i =0;
        for(Node n = top; n!=null; n=n.next){
            a[i] = n.val;
            i++;
        }
        return a;
    }
    public int search(Object e){
        int i =0;
        for(Node n = top; n!=null; n=n.next){
            if(n.val.equals(e)){
                return i;
            }
            i++;
        }
        return -1;
    }
    
}