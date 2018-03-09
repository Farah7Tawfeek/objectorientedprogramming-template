package oop.pset3.model;

import java.util.List;

public class Rock implements Movements {
    @Override
    public List<Movements> getWhoCanKill() {

        whoCanKill.add(new Paper());
        whoCanKill.add(new Spock());
        return whoCanKill;
    }

    @Override
    public String choose()
    {
        return "Rock";
    }
}
