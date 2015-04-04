/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ww2.zombies.main;

import byui.cit260.ww2Zombies.model.Game;
import byui.cit260.ww2Zombies.model.Player;
import java.io.BufferedReader;
import java.io.PrintWriter;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SilentMan
 */
public class WW2ZombiesTest {
    
    public WW2ZombiesTest() {
    }

    /**
     * Test of main method, of class WW2Zombies.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        WW2Zombies.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentGame method, of class WW2Zombies.
     */
    @Test
    public void testGetCurrentGame() {
        System.out.println("getCurrentGame");
        Game expResult = null;
        Game result = WW2Zombies.getCurrentGame();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCurrentGame method, of class WW2Zombies.
     */
    @Test
    public void testSetCurrentGame() {
        System.out.println("setCurrentGame");
        Game currentGame = null;
        WW2Zombies.setCurrentGame(currentGame);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayer method, of class WW2Zombies.
     */
    @Test
    public void testGetPlayer() {
        System.out.println("getPlayer");
        Player expResult = null;
        Player result = WW2Zombies.getPlayer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPlayer method, of class WW2Zombies.
     */
    @Test
    public void testSetPlayer() {
        System.out.println("setPlayer");
        Player player = null;
        WW2Zombies.setPlayer(player);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getOutFile method, of class WW2Zombies.
     */
    @Test
    public void testGetOutFile() {
        System.out.println("getOutFile");
        PrintWriter expResult = null;
        PrintWriter result = WW2Zombies.getOutFile();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setOutFile method, of class WW2Zombies.
     */
    @Test
    public void testSetOutFile() {
        System.out.println("setOutFile");
        PrintWriter outFile = null;
        WW2Zombies.setOutFile(outFile);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getInFile method, of class WW2Zombies.
     */
    @Test
    public void testGetInFile() {
        System.out.println("getInFile");
        BufferedReader expResult = null;
        BufferedReader result = WW2Zombies.getInFile();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setInFile method, of class WW2Zombies.
     */
    @Test
    public void testSetInFile() {
        System.out.println("setInFile");
        BufferedReader inFile = null;
        WW2Zombies.setInFile(inFile);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getLogFile method, of class WW2Zombies.
     */
    @Test
    public void testGetLogFile() {
        System.out.println("getLogFile");
        PrintWriter expResult = null;
        PrintWriter result = WW2Zombies.getLogFile();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setLogFile method, of class WW2Zombies.
     */
    @Test
    public void testSetLogFile() {
        System.out.println("setLogFile");
        PrintWriter logFile = null;
        WW2Zombies.setLogFile(logFile);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
