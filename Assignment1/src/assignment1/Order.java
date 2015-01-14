/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author c0648442
 */
public class Order {
    private String customerID;
    private String customerName;
    private Date timeReceived;
    private Date ProcessingTime;
    private Date timeFulfilled;
    
    private String notes;
    private List<Purchase> listOfPurchase=new ArrayList<>();

    public Order(String customerID, String customerName) {
        this.customerID = customerID;
        this.customerName = customerName;
    }
    public void addPurchase(Purchase p) {
       listOfPurchase.add(p); 
    }

    public String getCustomerID() {
        return customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Date getTimeReceived() {
        return timeReceived;
    }

    public Date getProcessingTime() {
        return ProcessingTime;
    }

    public Date getTimeFulfilled() {
        return timeFulfilled;
    }

    public String getNotes() {
        return notes;
    }

    public List<Purchase> getListOfPurchase() {
        return listOfPurchase;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setTimeReceived(Date timeReceived) {
        this.timeReceived = timeReceived;
    }

    public void setProcessingTime(Date ProcessingTime) {
        this.ProcessingTime = ProcessingTime;
    }

    public void setTimeFulfilled(Date timeFulfilled) {
        this.timeFulfilled = timeFulfilled;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public void setListOfPurchase(List<Purchase> listOfPurchase) {
        this.listOfPurchase = listOfPurchase;
    }
    
}
