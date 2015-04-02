/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ww2Zombies.view;

/**
 *
 * @author SilentMan
 */
public class GameMenuView extends View{
    public GameMenuView() {

    super("\n + "
                + "\n--------------------------------"
                + "\n|         Help Menu            |"
                + "\n--------------------------------"
                + "\nD - Game Description"
                + "\nL - Look Around"
                //+ \"\\nW - Move North\"\n" +
                //+ \"\\nS - Move South\"\n" +
                //+ \"\\nA - Move East\"\n" +
                //+ \"\\nD - Move West\"\n" +
                + "\nM - View Map"
                + "\nV - View Inventory"
                + "\nR - Return to Previous Menu"
                + "\n-------------------------------");
    
    
    public void displayMenu() {
        System.out.println("displayMenu function called");
    }
}
}
