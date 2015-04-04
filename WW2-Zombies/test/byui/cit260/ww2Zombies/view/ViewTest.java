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
public class ViewTest {
    
    public ViewTest() {
    }

    /**
     * Test of display method, of class View.
     */
    @Test
    public void testDisplay() {
        System.out.println("display");
        View instance = null;
        instance.display();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getInput method, of class View.
     */
    @Test
    public void testGetInput() {
        System.out.println("getInput");
        View instance = null;
        String expResult = "";
        String result = instance.getInput();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPromptMessage method, of class View.
     */
    @Test
    public void testGetPromptMessage() {
        System.out.println("getPromptMessage");
        View instance = null;
        String expResult = "";
        String result = instance.getPromptMessage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPromptMessage method, of class View.
     */
    @Test
    public void testSetPromptMessage() {
        System.out.println("setPromptMessage");
        String promptMessage = "";
        View instance = null;
        instance.setPromptMessage(promptMessage);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    public class ViewImpl extends View {

        public ViewImpl() {
            super("");
        }

        @Override
        public boolean doAction(Object obj) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
}
