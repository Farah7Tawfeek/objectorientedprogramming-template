package oop.pset3.model;

import java.util.List;

public class Paper implements Movements {


    @Override
    public List<Movements> getWhoCanKill() {

        whoCanKill.add(new Scissros());
        whoCanKill.add(new Lizard());
        return whoCanKill;
    }

    @Override
    public String choose()
    {
        return "Paper";
    }
}
