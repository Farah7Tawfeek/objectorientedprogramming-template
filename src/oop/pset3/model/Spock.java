package oop.pset3.model;

import java.util.List;

public class Spock implements Movements {

    @Override
    public List<Movements> getWhoCanKill() {

        whoCanKill.add(new Lizard());
        whoCanKill.add(new Paper());
        return whoCanKill;
    }

    @Override
    public String choose()
    {
        return "Spock";
    }
}
