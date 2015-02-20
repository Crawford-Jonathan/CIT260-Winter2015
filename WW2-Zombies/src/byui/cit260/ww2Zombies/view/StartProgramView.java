/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ww2Zombies.view;

import byui.cit260.ww2Zombies.control.ProgramControl;
import byui.cit260.ww2Zombies.model.Player;
import java.util.Scanner;

/**display title screen / banner
 *press enter to continue and enter name
 *continue to main menu
 */
public class StartProgramView{
    public StartProgramView(){
    }
    public void startProgram(){
        //displays the banner screen
        this.displayBanner();
        
        //get the Player name
        String playersName = this.getPlayersName();
        
        //create and save the player object
        Player player = ProgramControl.createPlayer(playersName);
    }
    private void displayBanner() {
        System.out.println(
                "\n\n*********************************************************"
        );
        System.out.println(
                    "*                                                       *"
                + "\n*              Welcome to the Jungle                    *"
                + "\n*              Congradulations Soldier!                 *"
                + "\n*     You have been selected for a special mission.     *"
                + "\n*            Mission Briefing will follow.              *"
                + "\n*                                                       *"
        );
        System.out.println(
                    "*                                                       *"
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
        );
        System.out.println(
                  "***********************************************************"
        );
    }
    
    //get the Player name, if new name than create new Player account
    public String getPlayersName() {
        //indicates if player name has been retreived
        boolean valid = false;
        String playersName = null;
        //gets input from the keyboard
        Scanner keyboard = new Scanner(System.in);
        
        while(!valid) {
            //asks for players name
            System.out.println("Enter the player's name below");
            
            //gets name from the keyboard and trims off the blanks
            playersName = keyboard.nextLine();
            playersName = playersName.trim();
            
            //invalid cases
            if (playersName.length() < 2) {
                System.out.println("Invalid name - name must be longer than 2 characters");
                //repeats
                continue;
            }
            
            //breaks out of the repetition
            break;
        }
        //return the playersNAme
        return playersName;
        
        }
    
    
}
