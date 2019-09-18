/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package patient;

/**
 *
 * @author 14321005
 */
public class ArrayQueue implements Queue{
        
        int size;
        int front;
        int rear;
        Object [] data;
        
        public ArrayQueue(){
                size=0;
                front = -1;
                rear = -1;
                data = new Object[5];
        }
        public int size(){
                return size;
        }
        public boolean isEmpty(){
                if(size==0){
                        return true;
                }else{
                        return false;
                }
        }
        public void enqueue(Object o) throws QueueOverflowException{
                if(size==data.length){
                        throw new QueueOverflowException();
                }else{
                        if(front == -1||rear == -1){
                                front=0;
                                rear=0;
                                data[rear]=o;
                                size=size+1;
                        }else{
                                rear=(rear+1)%data.length;
                                data[rear]=o;
                                size=size+1;
                        }
                }
        }
        public Object dequeue() throws QueueUnderflowException{
                if(front == -1||rear == -1){
                        throw new  QueueUnderflowException();
                }else{
                        if(front==rear){
                                Object r=data[front];
                                data[front]=null;
                                front=-1;
                                rear=-1;
                                size=size-1;
                                return r;
                        }else{
                                Object r=data[front];
                                data[front]=null;
                                front=(front+1)%data.length;
                                size=size-1;
                                return r;
                        }
                }
        }
        public Object peek() throws QueueUnderflowException{
                if(front == -1||rear == -1){
                        throw new  QueueUnderflowException();
                }else{
                        
                        Object r=data[front];
                        return r;
                }
        }
        public String toString(){
                String mystr = " [ ";
                int f = front;
                for(int i=0;i<size;i++){
                        mystr = mystr +data[f]+" ";
                        f=(f+1)%data.length;
                }
                mystr=mystr+"]";
                return mystr;
        }
        public Object[] toArray(){
                Object []n = new Object[size];
                int f=front;
                for(int i=0;i<size;i++){
                        n[i]=data[f];
                        f=(f+1)%data.length;
                        
                }
                return n;
        }
        public void CancelAll(){
                int f=front;
                for(int i=0;i<size;i++){
                        data[f]=null;
                        f=(f+1)%data.length;
                }
        }
        public int search(Object o){
                int i=0;
                int temp=-1;
                int f=front;
                for(i=0;i<size;i++){
                        if(data[f].equals(o)){
                                temp=i;
                                break;
                        }else{
                                f=(f+1)%data.length;
                        }
                }
                return temp;
        }
}
