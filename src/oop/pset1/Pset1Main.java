package oop.pset1;
import oop.pset1.controller.Summarizer;
import oop.pset1.model.Actors;
import oop.pset1.model.Movie;
import oop.pset1.model.Summary;
import oop.pset1.parser.ActorsParser;
import oop.pset1.parser.MovieParser;
import oop.pset1.view.MovieActorsDisplayer;

import java.util.List;

public class Pset1Main {
    public static void main(String[] args) {

        MovieParser movieParser = new MovieParser();
        List<Movie> movies = movieParser.getMovies();


        Summarizer summarizer = new Summarizer();
        //Summary summary = new Summary();
       Summary summary = summarizer.summarize(movies);

        MovieActorsDisplayer displayer = new MovieActorsDisplayer();
        displayer.display(summary);


        ActorsParser actorsParser = new ActorsParser();
        List<Actors> actors = actorsParser.getActors();

        //Summary summary1 = new Summary();
        summary = summarizer.ActorSummarize(actors);

        displayer.displayActors(summary);
    }
}
