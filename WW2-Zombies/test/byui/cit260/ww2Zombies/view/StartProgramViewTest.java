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
 * @author SilentMan
 */
public class StartProgramViewTest {
    
    public StartProgramViewTest() {
    }

    /**
     * Test of doAction method, of class StartProgramView.
     */
    @Test
    public void testDoAction() {
        System.out.println("doAction");
        Object obj = null;
        StartProgramView instance = new StartProgramView();
        boolean expResult = false;
        boolean result = instance.doAction(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
