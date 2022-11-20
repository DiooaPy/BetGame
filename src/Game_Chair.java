public class Game_Chair {


    public Game_Chair() {
        Player computer = new Player();
        Player player_2 = new Player();
        BetMore_Game bet = new BetMore_Game();
        int com_num = computer.Start(bet);
        int play2_num = player_2.Start(bet);
        String winner = bet.FindWinner(computer, player_2);
        System.out.println(winner);

    }
}
