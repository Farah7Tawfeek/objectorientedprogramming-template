package oop.pset3.model;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class ComputerPlayer implements Players {
    private Movements movements ;

    @Override
    public Movements getMovement() {
        MoveType moveType = new MoveType();
        List<Movements> movements = moveType.getMovements();
        Collections.shuffle(movements);
        Optional<Movements> first = movements.stream().findAny();
        if (first.isPresent()){
            return first.get();
        }
        return null;
    }



}
