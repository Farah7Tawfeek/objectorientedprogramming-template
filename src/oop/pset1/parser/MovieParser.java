package oop.pset1.parser;

import oop.pset1.model.Movie;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MovieParser {

    public List<Movie> getMovies() {
        String filePath = "src/oop/pset1/data/movies.csv";
        try {
            Stream<String> lines = Files.lines(Paths.get(filePath));
            return lines.skip(1)
                    .map(line -> line.split(";"))
                    .filter(line -> line.length == 24)
                    .filter(line -> line != null)
                    .map(toMovie())
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }

    }

    private Function<String[], Movie> toMovie() {
        return columns -> {
            Movie movie = new Movie();
            movie.setMovieName(columns[20]);
            movie.setRating(Double.parseDouble(columns[22]));
            movie.setGenres(toGenres(columns[3]));
            return movie;

        };
    }


    private List<String> toGenres(String column) {
        String objects = column.replaceAll("\\[","").replaceAll("]","");
        objects = objects.replaceAll("\\{","").replaceAll("}","");

                objects = objects.replaceAll("'id': ","").replaceAll("[0-9]","");
                String[] genres = objects.split(",");
                return Stream.of(genres)
                .map(genre -> genre.split(":"))
                .filter(genre -> genre.length == 2)
                .map(genre -> genre[1])
                .map(genre -> genre.replaceAll("'",""))
                .collect(Collectors.toList());
                }
                }



















