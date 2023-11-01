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
public class RaitaRiceDecorator extends RiceDecorator {
    public RaitaRiceDecorator(Rice rice) {
        super(rice);
    }

    RaitaRiceDecorator(Rice rice) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected String getTopping() {
        return "raita";
    }

    @Override
    protected double getToppingPrice() {
        return 2.00;
    }
}
