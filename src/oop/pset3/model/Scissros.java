package oop.pset3.model;

import java.util.List;

public class Scissros implements Movements {
    @Override
    public List<Movements> getWhoCanKill() {

        whoCanKill.add(new Rock());
        whoCanKill.add(new Spock());
        return whoCanKill;

    }

    @Override
    public String choose()
    {
        return "Scissros";
    }
}
