/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author c0649005
 */
public class OrderTest {

    public OrderTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of addPurchase method, of class Order.
     */
    @Test
    public void testAddPurchase() {
        System.out.println("addPurchase");
        Purchase p = null;
        Order instance = null;
        instance.addPurchase(p);

    }

    /**
     * Test of getCustomerID method, of class Order.
     */
    @Test
    public void testGetCustomerID() {
        System.out.println("getCustomerID");
        Order instance = null;
        String expResult = "";
        String result = instance.getCustomerID();
        assertEquals(expResult, result);

    }

    /**
     * Test of getCustomerName method, of class Order.
     */
    @Test
    public void testGetCustomerName() {
        System.out.println("getCustomerName");
        Order instance = null;
        String expResult = "";
        String result = instance.getCustomerName();
        assertEquals(expResult, result);

    }

    /**
     * Test of getTimeReceived method, of class Order.
     */
    @Test
    public void testGetTimeReceived() {
        System.out.println("getTimeReceived");
        Order instance = null;
        String expResult = "";
        String result = instance.getTimeReceived();
        assertEquals(expResult, result);

    }

    /**
     * Test of getProcessingTime method, of class Order.
     */
    @Test
    public void testGetProcessingTime() {
        System.out.println("getProcessingTime");
        Order instance = null;
        String expResult = "";
        String result = instance.getProcessingTime();
        assertEquals(expResult, result);

    }

    /**
     * Test of getTimeFulfilled method, of class Order.
     */
    @Test
    public void testGetTimeFulfilled() {
        System.out.println("getTimeFulfilled");
        Order instance = null;
        String expResult = "";
        String result = instance.getTimeFulfilled();
        assertEquals(expResult, result);

    }

    /**
     * Test of getNotes method, of class Order.
     */
    @Test
    public void testGetNotes() {
        System.out.println("getNotes");
        Order instance = null;
        String expResult = "";
        String result = instance.getNotes();
        assertEquals(expResult, result);

    }

    /**
     * Test of getListOfPurchase method, of class Order.
     */
    @Test
    public void testGetListOfPurchase() {
        System.out.println("getListOfPurchase");
        Order instance = null;
        List<Purchase> expResult = null;
        List<Purchase> result = instance.getListOfPurchase();
        assertEquals(expResult, result);

    }

    /**
     * Test of setCustomerID method, of class Order.
     */
    @Test
    public void testSetCustomerID() {
        System.out.println("setCustomerID");
        String customerID = "";
        Order instance = null;
        instance.setCustomerID(customerID);

    }

    /**
     * Test of setCustomerName method, of class Order.
     */
    @Test
    public void testSetCustomerName() {
        System.out.println("setCustomerName");
        String customerName = "";
        Order instance = null;
        instance.setCustomerName(customerName);

    }

    /**
     * Test of setTimeReceived method, of class Order.
     */
    @Test
    public void testSetTimeReceived() {
        System.out.println("setTimeReceived");
        String timeReceived = "";
        Order instance = null;
        instance.setTimeReceived(timeReceived);

    }

    /**
     * Test of setProcessingTime method, of class Order.
     */
    @Test
    public void testSetProcessingTime() {
        System.out.println("setProcessingTime");
        String ProcessingTime = "";
        Order instance = null;
        instance.setProcessingTime(ProcessingTime);

    }

    /**
     * Test of setTimeFulfilled method, of class Order.
     */
    @Test
    public void testSetTimeFulfilled() {
        System.out.println("setTimeFulfilled");
        String timeFulfilled = "";
        Order instance = null;
        instance.setTimeFulfilled(timeFulfilled);

    }

    /**
     * Test of setNotes method, of class Order.
     */
    @Test
    public void testSetNotes() {
        System.out.println("setNotes");
        String notes = "";
        Order instance = null;
        instance.setNotes(notes);

    }

    /**
     * Test of setListOfPurchase method, of class Order.
     */
    @Test
    public void testSetListOfPurchase() {
        System.out.println("setListOfPurchase");
        List<Purchase> listOfPurchase = null;
        Order instance = null;
        instance.setListOfPurchase(listOfPurchase);

    }

    @Test
    public void testWhenCustomerExistsAndPurchasedExistThenTimeReceivedIsNow() {
     OrderTest orderQueue=new OrderTest();
    
     
    }

    @Test
    public void testWhenRequestToProcessOrderAndOrderNotHaveTimeReceivedThenThrowException() {

    }

    @Test
    public void testWhenRequestToFilfullOrderAndOrderHasTimeProcessedAndTimeReceivedThenSetTheFulfilledTime() {

    }

    @Test
    public void testWhenRequestToFulFillOrderAndOrderNotHaveTimeProcessedThenThrowException() {

    }

    @Test
    public void testWhenRequestToFulFillOrderAndOrderNotHaveTimeReceivedThenThrowException() {

    }

    @Test
    public void testWhenRequestToReportAndNoOrderInSystemThenRetuenEmptyString() {

    }

}
