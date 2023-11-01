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
public class DecratorCode {
    public static void main(String[] args) {
        Customer customer = new Customer("Alice");

        // Create a basic rice order
        Rice rice = new BasicRice();

        // Add toppings to the rice
        Rice raitaRice = new RaitaRiceDecorator(rice);
        Rice saladRice = new SaladRiceDecorator(rice);

        // Place an order for each type of rice
        Order raitaRiceOrder = new Order(customer, raitaRice);
        Order saladRiceOrder = new Order(customer, saladRice);

        // Place the orders with the kitchen
        customer.placeOrder(raitaRiceOrder);
        customer.placeOrder(saladRiceOrder);
    }
}
