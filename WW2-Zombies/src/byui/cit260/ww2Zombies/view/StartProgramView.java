/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ww2Zombies.view;

import byui.cit260.ww2Zombies.control.ProgramControl;
import byui.cit260.ww2Zombies.model.Player;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * display title screen / banner press enter to continue and enter name continue
 * to main menu
 */
public class StartProgramView extends View {

    //sends message to the View display().  Everything to be displayed.
    public StartProgramView() {
        super("\n\n*********************************************************"
                + "\n*                                                       *"
                + "\n*              Welcome to the Jungle                    *"
                + "\n*              Congradulations Soldier!                 *"
                + "\n*     You have been selected for a special mission.     *"
                + "\n*            Mission Briefing will follow.              *"
                + "\n*                                                       *"
                + "\n*                                                       *"
                + "\n*                     Your Mission:                     *"
                + "\n*            There have been reports from M.I.          *"
                + "\n*          suggesting that a previously uninhabited     *"
                + "\n*         island by Japan has been occupied by          *"
                + "\n*         the Germans. You are to go to this island     *"
                + "\n*        and find out what they are doing there and     *"
                + "\n*          disrupt their operations. You and your       *"
                + "\n*           fire-team will be air-dropped in 0400.      *"
                + "\n*                  Good luck Soldier.                   *"
                + "\n*             P.S. Watch out for the jungle life,       *"
                + "\n*                some may want your blood.....          *"
                + "\n*                                                       *"
                + "\n***********************************************************"
                + "\n \n Enter the player's name below");
        
    }

    private void displayWelcomeMessage(Player player) {
        System.out.println("\n\n================================================");
        System.out.println("\tWelcome to the game Sergeant " + player.getName());
        System.out.println("\tGo out there and do your country proud!");
        System.out.println("====================================================");
    }

    @Override
    public boolean doAction(Object obj) {
        
       
        
        String playersName = (String)obj;
        Player player = ProgramControl.createPlayer(playersName);
    
        //displays the welcome message
        this.displayWelcomeMessage(player);

        //display Main Menu
        MainMenuView mainMenu = new MainMenuView();

        mainMenu.display();
        return false;
        //return display();
    }

    /**
    @Override
    public boolean doAction(Object obj) {
        String playersName = (String)obj;
        
        return false;
    }
    
    public void startProgram() {
        //String playersName = (String);
        Player player = ProgramControl.createPlayer(playersName);
    
        //displays the welcome message
        this.displayWelcomeMessage(player);

        //display Main Menu
        MainMenuView mainMenuView = new MainMenuView();

        mainMenuView.display();
        //return false;
    }
    */
}
