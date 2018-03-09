package oop.pset3.controller;

import oop.pset3.model.Movements;

import java.util.Optional;

public class Judge {

    public void decide(Movements movement1, Movements movement2) {

        System.out.println("Player 1 move is : " + movement1.choose());
        System.out.println("Player 2 move is : " + movement2.choose());

        if (movement1.choose().equals(movement2.choose())) {
            System.out.println(" Tie ");
        } else {
            Optional<Movements> first = movement1.getWhoCanKill().stream()
                    .filter(e -> e.choose().equalsIgnoreCase(movement2.choose().toString()))
                    .findFirst();
            if (first.isPresent()) {
                System.out.println("you Loooooooooooooooooose !!! HaHaHa");
            } else {
                System.out.println("you Win :)");
            }
        }
    }
}