package oop.pset1.view;

import oop.pset1.model.Summary;

public class MovieDisplayer {
    public void display(Summary summary){
        // Display 5 most rated movies
        System.out.println("Most rated films:");
        summary.getTopRatedMovies()
                .forEach(movies -> System.out.println(movies));
        System.out.println("------");
        //Display the most appearing movie genres:

        System.out.println("Most appearing movie genres: ");
        summary.getTopFeedbackGenres()
                .forEach(genre -> System.out.println(genre));

        System.out.println("------");

    }

    public void displayActors(Summary summary){
        System.out.println("Top Hierd Actors: ");
        summary.getTopHiredActors().forEach(System.out::println);

        System.out.println("------");
        System.out.println("Top male female ratio: ");

        summary.getMalefemaleRatio().forEach(System.out::println);
    }

}
