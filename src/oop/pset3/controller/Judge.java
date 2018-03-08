package oop.pset3.controller;

import oop.pset2.model.Movements;

public class Judge {

    public void decide(Movements movement1, Movements movement2) {

        System.out.println("The result of this round is ...!jjjjjjj");
        System.out.println("Player 1 move is : " + movement1.choose());
        System.out.println("Player 2 move is : " + movement2.choose());

        if (movement1.choose().equalsIgnoreCase(movement2.choose())) {
            System.out.println("Nobody wins");
        } else if (movement1.choose().equalsIgnoreCase("Sicissros") && movement2.choose().equalsIgnoreCase("Paper")) {
            System.out.println("Player 1 wins ");
        }
        else if (movement1.choose().equalsIgnoreCase("Rock") && movement2.choose().equalsIgnoreCase("Scissros"))
        {
            System.out.println("Player 1 wins");
        }
        else if (movement1.choose().equalsIgnoreCase("Paper")&& movement2.choose().equalsIgnoreCase("Rock"))
        {
            System.out.println("Player 1 wins");
        }
        else
        {
            System.out.println("The Player 2 won !!");
        }
    }
}
