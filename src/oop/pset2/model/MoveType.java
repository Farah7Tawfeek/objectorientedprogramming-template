package oop.pset2.model;

import java.util.ArrayList;
import java.util.List;

public class MoveType {

    private List<Movements> movements = new ArrayList<>();
    public List<Movements> getMovements() {
        movements.add(new Rock());
        movements.add(new Paper());
        movements.add(new Scissros());
        return movements;
    }
}