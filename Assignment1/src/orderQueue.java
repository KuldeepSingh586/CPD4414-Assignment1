
import assignment1.Order;
import java.util.ArrayDeque;
import java.util.Date;
import java.util.Queue;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author c0649005
 */
public class orderQueue {
    
     Queue<Order> orderQueue = new ArrayDeque<>();
    
    public void add(Order order) {
        orderQueue.add(order);
        order.setTimeReceived(new Date());
    }
}

