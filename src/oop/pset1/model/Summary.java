package oop.pset1.model;

import java.util.List;

public class Summary {

    private List<String> topHiredActors ;

    private List<String> topRatedMovies;

    private List<String> topFeedbackGenres;

    private List<String> malefemaleRatio;

    public List<String> getTopHiredActors() {
        return topHiredActors;
    }

    public void setTopHiredActors(List<String> topHiredActors) {
        this.topHiredActors = topHiredActors;
    }

    public List<String> getTopFeedbackGenres() {
        return topFeedbackGenres;
    }

    public void setTopFeedbackGenres(List<String> topFeedbackGenres) {
        this.topFeedbackGenres = topFeedbackGenres;
    }

    public List<String> getTopRatedMovies() {
        return topRatedMovies;
    }

    public void setTopRatedMovies(List<String> topRatedMovies) {
        this.topRatedMovies = topRatedMovies;
    }

    public List<String> getMalefemaleRatio() {
        return malefemaleRatio;
    }

    public void setMalefemaleRatio(List<String> malefemaleRatio) {
        this.malefemaleRatio = malefemaleRatio;
    }
}
