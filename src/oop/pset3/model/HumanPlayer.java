package oop.pset3.model;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class HumanPlayer implements Players {

    @Override
    public Movements getMovement()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose Rock or Paper or Scissros or Lizard or Spock");
        String line = scanner.nextLine();
        MoveType moveType = new MoveType();
        List<Movements> movements = moveType.getMovements();
        Optional<Movements> first = movements.stream().filter(e -> e.choose().equalsIgnoreCase(line)).findFirst();
        if (first.isPresent()){
            return first.get();
        }
            return null;
    }
}
