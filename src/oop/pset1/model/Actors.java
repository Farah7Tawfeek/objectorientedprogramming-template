package oop.pset1.model;

import java.util.List;

public class Actors {
    private List<String> actorsNames ;
    private List<String> actorsGender;


    public List<String> getActorsNames() {
        return actorsNames;
    }

    public void setActorsNames(List<String> actorsNames) {
        this.actorsNames = actorsNames;
    }

    public List<String> getActorsGender() {
        return actorsGender;
    }

    public void setActorsGender(List<String> actorsGender) {
        this.actorsGender = actorsGender;
    }
}
