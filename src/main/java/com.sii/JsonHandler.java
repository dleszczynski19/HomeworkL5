package com.sii;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JsonHandler {
    public static JsonNode getJson(String jsonName) {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = null;

        try {
            jsonNode = objectMapper.readTree(new File("src/main/resources/" + jsonName + ".json"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return jsonNode;
    }

    public static Movie deserializeMovie(JsonNode jsonNode, int index, Director director) {
        return new Movie(jsonNode.get(index).get("title").asText(), jsonNode.get(index).get("date").asInt(),
                jsonNode.get(index).get("genre").asText(), director);
    }

    public static Actor deserializeActor(JsonNode jsonNode, int index, int actorIndex) {
        return new Actor(jsonNode.get(index).get("actors").get(actorIndex).get("name").asText(),
                jsonNode.get(index).get("actors").get(actorIndex).get("lastName").asText());
    }

    public static Director deserializeDirector(JsonNode jsonNode, int index) {
        return new Director(jsonNode.get(index).get("director").get("name").asText(),
                jsonNode.get(index).get("director").get("lastName").asText());
    }
}
