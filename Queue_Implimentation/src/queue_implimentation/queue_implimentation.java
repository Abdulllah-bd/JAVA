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
public class queue_implimentation {
    public static void main(String[] args) {
        ArrayQueue aq = new ArrayQueue();
        ListQueue lq = new ListQueue();
        try
        {
          lq.enqueue(10);
          lq.enqueue(20);
          lq.enqueue(30);
          lq.enqueue(40);
          lq.enqueue(50);
          System.out.println(lq);
          lq.dequeue();
          lq.toArray();
          lq.isEmpty();
          aq.enqueue(10);
          aq.enqueue(20);
          aq.enqueue(30);
          aq.enqueue(40);
          aq.enqueue(50);
          System.out.println(aq);
          aq.dequeue();
          aq.toArray();
          aq.isEmpty();}
        catch(Exception e) {
          System.out.println("Exception Found!");
        }
    }
}
