
package com.jac.junit;

/**
 *
 * @author hp
 */
public class CalService {
    
    ICalculator cal;
    
    int addTwoNum(int a, int b) throws NullPointerException{
        return cal.add(a, b);
    }

    public ICalculator getCal() {
        return cal;
    }

    public void setCal(ICalculator cal) {
        this.cal = cal;
    }
//test _bi fetch
   //added new feature on 21-08-2022
}
