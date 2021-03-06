package com.sii.models;

import com.sii.handlers.InputHandler;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String title;
    private int releaseDate;
    private String genre;
    private List<Actor> actors = new ArrayList<>();
    private Director director;

    public Movie() {
    }

    public Movie(String title, int releaseDate, String movieGenre, Director director) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.genre = movieGenre;
        this.director = director;
    }

    public void addActors(Actor actor) {
        actors.add(actor);
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return InputHandler.TextColor.BLUE.getColor() + "\tTitle: " + title + "\n\tDirector: " + director +
                "\n\tGenre: " + genre + "\n\tDate: " + releaseDate + "\n\tActors: " + actors +
                InputHandler.TextColor.RESET.getColor();
    }
}