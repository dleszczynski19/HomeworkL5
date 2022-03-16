package com.sii;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class MovieLibrary {
    private List<Movie> movies = new ArrayList<>();

    public void addMovies(Movie movie) {
        movies.add(movie);
    }

    public List<Movie> filterByDate(int dateFrom, int dateTo) {
        return movies.stream()
                .filter(movie -> movie.getReleaseDate() >= dateFrom)
                .filter(movie -> movie.getReleaseDate() <= dateTo)
                .collect(Collectors.toList());
    }

    public void printByActors(String name, String lastName) { //TODO uprościć
        movies.stream()
                .filter(movie -> movie.getActors().get(0).getName().equals(name))
                .filter(movie -> movie.getActors().get(0).getLastName().equals(lastName))
                .map(Movie::getTitle)
                .forEach(System.out::println);
    }

    public void printRandomFilm() {
        System.out.println(movies.get(new Random().nextInt(movies.size() - 1)).toString());
    }

    public void printByFilter(List<Movie> movies) {
        movies.stream().map(Movie::getTitle).forEach(System.out::println);
    }
}
