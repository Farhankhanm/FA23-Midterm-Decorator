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
public class BasicRice implements Rice {
    @Override
    public String getDescription() {
        return "Basic rice";
    }

    @Override
    public double getPrice() {
        return 10.00;
    }
}