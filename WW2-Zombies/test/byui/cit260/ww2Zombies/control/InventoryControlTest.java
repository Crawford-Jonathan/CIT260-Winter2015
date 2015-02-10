/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ww2Zombies.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SilentMan
 */
public class InventoryControlTest {
    
    public InventoryControlTest() {
    }

    /**
     * Test of upgradeCarrySpace method, of class InventoryControl.
     */
    @Test
    public void testUpgradeCarrySpace() {
        System.out.println("upgradeCarrySpace");
        double height = 12.0;
        double width = 24.0;
        double depth = 6.0;
        InventoryControl instance = new InventoryControl();
        double expResult = 1728.0;
        double result = instance.upgradeCarrySpace(height, width, depth);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
