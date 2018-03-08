package oop.pset3.controller;

import oop.pset2.model.Movements;
import oop.pset2.model.Players;

public class PlayRound {

    public void play(Players player1,Players player2){

        Movements movement1 = player1.getMovement();
        Movements movement2 = player2.getMovement();
        Judge judge = new Judge();
        judge.decide(movement1,movement2);

    }


}
