package com.sii;

import com.fasterxml.jackson.databind.JsonNode;

public class DataGenerator {
    public static void fillData(JsonNode jsonNode, MovieLibrary movieLibrary) {
        for (int filmIndex = 0; filmIndex < jsonNode.size(); filmIndex++) {
            Movie newMovie = JsonHandler.deserializeMovie(jsonNode, filmIndex, JsonHandler.deserializeDirector(jsonNode, filmIndex));
            movieLibrary.addMovies(newMovie);
            for (int actorIndex = 0; actorIndex < jsonNode.get(filmIndex).get("actors").size(); actorIndex++) {
                newMovie.addActors(JsonHandler.deserializeActor(jsonNode, filmIndex, actorIndex));
            }
        }
    }
}