package com.sii.objects;

import com.sii.handlers.InputHandler;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class MovieLibrary {
    private final List<Movie> movies = new ArrayList<>();

    public void addMovies(Movie movie) {
        movies.add(movie);
    }

    public List<Movie> getMoviesByDate(int dateFrom, int dateTo) {
        return movies.stream()
                .filter(movie -> movie.getReleaseDate() >= dateFrom)
                .filter(movie -> movie.getReleaseDate() <= dateTo)
                .collect(Collectors.toList());
    }

    public List<Movie> getMoviesByActor(Actor actor) {
        return movies.stream()
                .filter(movie -> movie.getActors().contains(actor))
                .collect(Collectors.toList());
    }

    public Movie getRandomMovie(){
       return movies.get(new Random().nextInt(movies.size() - 1));
    }

    public void printTitle(List<Movie> movies) {
        movies.stream()
                .map(Movie::getTitle)
                .forEach(movie -> System.out.println(InputHandler.TextColor.BLUE + "\tMovie: " +
                        InputHandler.TextColor.RESET + movie));
    }
}