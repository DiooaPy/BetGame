import java.util.Scanner;

public class Player {
    boolean computer;
    static int player_count;
    int picked_num;
    int player_num;

    public Player() {
        player_count++;
        player_num = player_count;
        computer = (player_count == 1 ? true : false);
        System.out.println("Player Number: " + player_count + " was created, and "
                + (computer ? "is" : "is not") + " a Computer.");

       



    }



    public int Start(BetMore_Game Bet) {
        int repeatable = 5;
        
        if (computer) {
            this.picked_num = Bet.Play();
            System.out.println("You picked number is: " + picked_num + ",Player " + player_num );
            
            
        } else {
            boolean again = true;
            Scanner input = new Scanner(System.in);
            


            while (repeatable > 0 && again) {
                repeatable--;
                this.picked_num = Bet.Play();
                System.out.println("You picked number is: " + this.picked_num + ",Player " + this.player_num );
                
                System.out.println("Do you want to pick again, Player " + this.player_num + "? [true/false]");
                
                again = input.nextBoolean();
                
               
               
                    
                

            }
            input.close();

            

        }
        return this.picked_num;
    }

}
