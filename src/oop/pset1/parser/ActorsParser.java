package oop.pset1.parser;

import oop.pset1.model.Actors;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ActorsParser {

    public List<Actors> getActors() {
        String filePath = "src/oop/pset1/data/actors.csv";
        try {
            Stream<String> lines = Files.lines(Paths.get(filePath));
            return lines.skip(1)
                    .map(line -> line.split(";"))
                    .filter(line -> line.length == 3)
                    .filter(line -> line != null)
                    .map(toActor())
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }

    }
    private Function<String[], Actors> toActor() {
        return columns -> {
            Actors actor = new Actors();
            actor.setActorsNames(torealActor(columns[0]));
            actor.setActorsGender(torealGender(columns[0]));
            return actor;

        };
    }

    private List<String> torealGender(String column) {
        String[] split = column
                .replaceAll("\\[","")
                .replaceAll("]","")
                .replaceAll("\\{","")
                .replaceAll("}","")
                .replaceAll("'","")
                .split(", ");


        return Stream.of(split)
                .map(e -> e.split(": "))
                .filter(e -> e.length == 2)
                .filter(e-> e[0].equals("gender"))
                .filter(e ->e[1].equals("1") || e[1].equals("2"))
                .map(e -> e[1])
                .collect(Collectors.toList());

    }

    private List<String> torealActor(String column) {

        String[] split = column
               .replaceAll("\\[","")
               .replaceAll("]","")
               .replaceAll("\\{","")
               .replaceAll("}","")
               .replaceAll("'","")
               .split(", ");

       return Stream.of(split)
               .map(e -> e.split(": "))
               .filter(e -> e.length == 2)
               .filter(e-> e[0].equals("name"))
               .map(e -> e[1])
               .collect(Collectors.toList());
    }

}