package oop.pset3.model;

import java.util.ArrayList;
import java.util.List;

public interface Movements {

    List<Movements> whoCanKill = new ArrayList<>();

    List<Movements> getWhoCanKill();

    String choose();

}
