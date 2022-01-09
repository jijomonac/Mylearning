
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
    
//commit testb 7_2
  
    
}
