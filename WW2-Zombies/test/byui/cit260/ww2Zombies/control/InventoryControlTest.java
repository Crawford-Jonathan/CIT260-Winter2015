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
        
        System.out.println("Testcase #1");
        double width = 12.0;
        double height = 24.0;
        double depth = 6.0;
        InventoryControl instance = new InventoryControl();
        double expResult = 1728.0;
        double result = instance.upgradeCarrySpace(height, width, depth);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    
        
        System.out.println("Testcase #2");
        width = 0.0;
        height = 24.0;
        depth = 6.0;
        //InventoryControl instance = new InventoryControl();
        expResult = -1;
        result = instance.upgradeCarrySpace(height, width, depth);
        assertEquals(expResult, result, 0.0001);
    
        System.out.println("Testcase #3");
        width = 36.0;
        height = 24.0;
        depth = 6.0;
        //InventoryControl instance = new InventoryControl();
        expResult = -1;
        result = instance.upgradeCarrySpace(height, width, depth);
        assertEquals(expResult, result, 0.0001);
        
        System.out.println("Testcase #4");
        width = 12.0;
        height = 0.0;
        depth = 6.0;
        //InventoryControl instance = new InventoryControl();
        expResult = -1;
        result = instance.upgradeCarrySpace(height, width, depth);
        assertEquals(expResult, result, 0.0001);
        
        System.out.println("Testcase #5");
        width = 12.0;
        height = 38.0;
        depth = 6.0;
        //InventoryControl instance = new InventoryControl();
        expResult = -1;
        result = instance.upgradeCarrySpace(height, width, depth);
        assertEquals(expResult, result, 0.0001);
        
        System.out.println("Testcase #6");
        width = 12.0;
        height = 24.0;
        depth = 0.0;
        //InventoryControl instance = new InventoryControl();
        expResult = -1;
        result = instance.upgradeCarrySpace(height, width, depth);
        assertEquals(expResult, result, 0.0001);
        
        System.out.println("Testcase #7");
        width = 12.0;
        height = 24.0;
        depth = 28.0;
        //InventoryControl instance = new InventoryControl();
        expResult = -1;
        result = instance.upgradeCarrySpace(height, width, depth);
        assertEquals(expResult, result, 0.0001);
        
        System.out.println("Testcase #8");
        width = 1.0;
        height = 24.0;
        depth = 6.0;
        //InventoryControl instance = new InventoryControl();
        expResult = 144;
        result = instance.upgradeCarrySpace(height, width, depth);
        assertEquals(expResult, result, 0.0001);
        
        System.out.println("Testcase #9");
        width = 24.0;
        height = 24.0;
        depth = 6.0;
        //InventoryControl instance = new InventoryControl();
        expResult = 3456;
        result = instance.upgradeCarrySpace(height, width, depth);
        assertEquals(expResult, result, 0.0001);
        
        System.out.println("Testcase #10");
        width = 12.0;
        height = 1.0;
        depth = 6.0;
        //InventoryControl instance = new InventoryControl();
        expResult = 72;
        result = instance.upgradeCarrySpace(height, width, depth);
        assertEquals(expResult, result, 0.0001);
        
        System.out.println("Testcase #11");
        width = 12.0;
        height = 36.0;
        depth = 6.0;
        //InventoryControl instance = new InventoryControl();
        expResult = 2592;
        result = instance.upgradeCarrySpace(height, width, depth);
        assertEquals(expResult, result, 0.0001);
        
        System.out.println("Testcase #12");
        width = 12.0;
        height = 24.0;
        depth = 1.0;
        //InventoryControl instance = new InventoryControl();
        expResult = 288;
        result = instance.upgradeCarrySpace(height, width, depth);
        assertEquals(expResult, result, 0.0001);
        
        System.out.println("Testcase #13");
        width = 12.0;
        height = 24.0;
        depth = 12.0;
        //InventoryControl instance = new InventoryControl();
        expResult = 3456;
        result = instance.upgradeCarrySpace(height, width, depth);
        assertEquals(expResult, result, 0.0001);
    }

    @Test
    public void testCalcBlast() {
    }
}
