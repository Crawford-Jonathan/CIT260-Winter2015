/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ww2Zombies.view;

/**display title screen / banner
 *press enter to continue and enter name
 *continue to main menu
 */
public class StartProgramView{
    public StartProgramView(){
    }
    public void startGame(){
        this.displayBanner();
    }
    private void displayBanner() {
        System.out.println(
                "/n/n*********************************************************"
        );
        System.out.println(
                "*                                                           *"
                + "/n*              Welcome to the Jungle                  *"
                + "/n*              Congradulations Soldier!                 *"
                + "/n*     You have been selected for a special mission.     *"
                + "/n*            Mission Briefing will follow.              *"
                + "/n*                                                       *"
        );
        System.out.println(
                "*                                                           *"
                + "n/*                     Your MIssion:                     *"
                + "n/*            There have been reports from M.I.          *"
                + "n/*          suggesting that a previously uninhabited *"
                        + "n/*         island by Japan has been occupied by "
                        + "               the Germans. You are to go to this island "
                        + " and find out what they are doing there and "
                        + "disrupt their operations. You and your fire-team will be air-dropped in 0400."
                        + "Good luck Soldier. "
                        + "P.S. Watch out for the jungle life, some may want your blood.....           *"
        );
    }
}
