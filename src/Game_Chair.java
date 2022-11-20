public class Game_Chair {


    public Game_Chair() {
        Player computer = new Player();
        Player player_2 = new Player();
        BetMore_Game bet = new BetMore_Game();
        int computer_number = computer.Start(bet);
        int player2_number = player_2.Start(bet);
        String winner = bet.FindWinner(computer, player_2);
        System.out.println(winner);

    }
}
