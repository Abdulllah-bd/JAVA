/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab07_ordered_nd_singly;

/**
 *
 * @author 14321005
 */
public class MyOrderList {
    public Node cursor;
    
    public Node GoToEnd(){
        Node n;
        for(n=cursor;n.element<n.next.element;n=n.next){
            
        }
        cursor=n;
        return n;
    }
    public Node GoToBegining(){
        Node start=GoToEnd().next;
        cursor=start;
        return start;
    }
    public void showList(){
        System.out.print(cursor.element);
        for(Node n=cursor.next;n!=cursor;n=n.next){
            System.out.print(n.element+" ");
        }
    }
    
    public Node gotoNext ( ){
        cursor=cursor.next;
        return cursor;
    }
    public Node gotoPrior ( ){
        return null;
    }
    public boolean Search(int a){
        boolean b=true;
        if(cursor.element==a){
            b=false;
        }
        for(Node n=cursor.next;n!=cursor;n=n.next){
        if(n.element==a){
            b=false;
        }
    }
        return b;
    }
    public void Insert(Node newElement){
        if(cursor==null){
            cursor.element=newElement.element;
            cursor.next=cursor;
        }
        else if(Search(newElement.element)==true){
            if(newElement.element<cursor.element){
                
            }
//            for(){
//                
//            }
        }
    }
    
}
