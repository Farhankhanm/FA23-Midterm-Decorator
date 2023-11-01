/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorcode;

/**
 *
 * @author fa20-bse-069
 */
public class Order {
    private Customer customer;
    private Rice rice;

    public Order(Customer customer, Rice rice) {
        this.customer = customer;
        this.rice = rice;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Rice getRice() {
        return rice;
    }

    public void prepare() {
        // Prepare the rice in the kitchen
    }
}