package oop.pset3;

import oop.pset3.controller.Judge;
import oop.pset3.controller.PlayRound;
import oop.pset3.model.ComputerPlayer;
import oop.pset3.model.HumanPlayer;
import oop.pset3.model.Players;
import oop.pset3.model.Welcome;


public class Pset3Main {

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
