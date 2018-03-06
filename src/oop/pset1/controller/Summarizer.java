package oop.pset1.controller;

import oop.pset1.model.Actors;
import oop.pset1.model.Movie;
import oop.pset1.model.Summary;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Summarizer {

    public Summary summarize(List<Movie> movies){
        // 5 most rated movies
        List<String> topRatedMovies = movies.stream()
                .sorted((e1, e2) -> e2.getRating().compareTo(e1.getRating()))
                .limit(5)
                .map(e-> e.getMovieName() + " (" + e.getRating() + ")")
                .collect(Collectors.toList());

        //2 most appearing movie genres
        Map<String, Long> appearances = movies.stream()
                .map(movie -> movie.getGenres())
                .flatMap(feedback -> feedback.stream())
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        List<String> topFeedbackGenres = appearances.entrySet().stream()
                .sorted((e1,e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(2)
                .map(e -> e.getKey() + " (" +e.getValue() + ")")
                .collect(Collectors.toList());

        Summary summary = new Summary();
        summary.setTopRatedMovies(topRatedMovies);
        summary.setTopFeedbackGenres(topFeedbackGenres);

        return summary ;
    }



    public Summary ActorSummarize(List<Actors> actors){
        Map<Object, Long> collect = actors.stream()
                .map(e -> e.getActorsNames())
                .flatMap(e -> e.stream())
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        List<String> collect1 = collect.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(5)
                .map(e -> e.getKey() + " (" + e.getValue() + ")")
                .collect(Collectors.toList());


        Map<String, Long> countingActorsGender= actors.stream()
                .map(e -> e.getActorsGender())
                .flatMap(e -> e.stream())
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        List<String> sortedGender = countingActorsGender.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> genderType(e.getKey()) + " == " + (Double.parseDouble(String.valueOf(e.getValue())) / 150105) * 100 + "%")
                .collect(Collectors.toList());

        Summary actorsSummary = new Summary();
        actorsSummary.setTopHiredActors(collect1);
        actorsSummary.setMalefemaleRatio(sortedGender);
        return actorsSummary ;

    }

    private String genderType(String key) {
        if (key.equals("1")){
            return "MALE";
        }
        else{
            return "FEMALE";
        }
    }
}
