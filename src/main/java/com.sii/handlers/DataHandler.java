package com.sii.handlers;

import com.fasterxml.jackson.databind.JsonNode;
import com.sii.models.Movie;
import com.sii.models.MovieLibrary;

public class DataHandler {
    public static void fillMoviesData(JsonNode jsonNode, MovieLibrary movieLibrary) {
        for (int filmIndex = 0; filmIndex < jsonNode.size(); filmIndex++) {
            Movie newMovie = JsonHandler.deserializeMovie(jsonNode, filmIndex, JsonHandler.deserializeDirector(jsonNode,
                    filmIndex));
            movieLibrary.addMovies(newMovie);
            for (int actorIndex = 0; actorIndex < jsonNode.get(filmIndex).get("actors").size(); actorIndex++) {
                newMovie.addActors(JsonHandler.deserializeActor(jsonNode, filmIndex, actorIndex));
            }
        }
    }
}