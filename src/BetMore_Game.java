public class BetMore_Game {

  private Shuffle s = new Shuffle();

  public int Play() {


    return s.pick_card();


  }

  public String FindWinner(Player computer, Player player_2) {
    String winner = "Player ";

    if (computer.picked_num > player_2.picked_num) {

      winner = winner + Integer.toString(computer.player_num) + " wins with Number "
          + computer.picked_num;



    } else if (computer.picked_num < player_2.picked_num) {

      winner = winner + Integer.toString(player_2.player_num) + " wins with Number "
          + player_2.picked_num;


    } else {
      winner = "both";
    }
    return winner;
  }



}
