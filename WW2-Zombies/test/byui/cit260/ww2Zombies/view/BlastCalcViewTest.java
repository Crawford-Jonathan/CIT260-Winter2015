/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ww2Zombies.view;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jonathan
 */
public class BlastCalcViewTest {
    
    public BlastCalcViewTest() {
    }

    /**
     * Test of calcBlast method, of class BlastCalcView.
     */
    @Test
    public void testCalcBlast() {
        System.out.println("calcBlast");
        double power = 50;
        double diameter = 50;
        double heat = 50;
        BlastCalcView instance = new BlastCalcView();
        double expResult = 125000;
        double result = instance.calcBlast(power, diameter, heat);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCalc method, of class BlastCalcView.
     */
    @Test
    public void testGetCalc() {
        System.out.println("getCalc");
        BlastCalcView instance = null;
        int expResult = 0;
        int result = instance.getCalc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doAction method, of class BlastCalcView.
     */
    @Test
    public void testDoAction() {
        System.out.println("doAction");
        String value = "";
        BlastCalcView instance = null;
        instance.doAction(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class BlastCalcViewImpl extends BlastCalcView {

        public BlastCalcViewImpl() {
            super("");
        }
    }
    
}
