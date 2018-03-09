package oop.pset3.model;

import java.util.List;

public class Lizard implements Movements {

    @Override
    public List<Movements> getWhoCanKill() {
        whoCanKill.add(new Scissros());
        whoCanKill.add(new Rock());
        return whoCanKill;
    }

    @Override
    public String choose()
    {
        return "Lizard";
    }

}
