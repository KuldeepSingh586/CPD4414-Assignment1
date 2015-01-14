/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment1;

/**
 *
 * @author c0648442
 */
class Purchase {
    
    private String productID;
    private int quantity;

     public Purchase(String productId, int quantity) {
        this.productID = productId;
        this.quantity = quantity;
    }
     
    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public static void main(String args[]){
        
    }
    
}
