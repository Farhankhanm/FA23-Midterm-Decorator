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
public abstract class RiceDecorator implements Rice {
    private Rice rice;

    public RiceDecorator(Rice rice) {
        this.rice = rice;
    }

    @Override
    public String getDescription() {
        return rice.getDescription() + " with " + getTopping();
    }

    @Override
    public double getPrice() {
        return rice.getPrice() + getToppingPrice();
    }

    protected abstract String getTopping();
    protected abstract double getToppingPrice();
}
