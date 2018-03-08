package oop.pset2;

import oop.pset2.controller.Judge;
import oop.pset2.controller.PlayRound;
import oop.pset2.model.ComputerPlayer;
import oop.pset2.model.HumanPlayer;
import oop.pset2.model.Players;
import oop.pset2.model.Welcome;


public class Pset2Main {

    public static void main(String[] args) {

        Welcome welcome = new Welcome();
        welcome.showWelcome();

        Players player1 = new HumanPlayer();
        Players player2 = new ComputerPlayer();

        PlayRound playRound = new PlayRound();
        playRound.play( player1,player2 );

        //DisplayResult displayResult = new DisplayResult();
        Judge judge = new Judge();
        judge.decide(player1.getMovement(),player2.getMovement());


    }
}
