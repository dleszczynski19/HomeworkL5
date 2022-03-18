package com.sii;

import com.sii.handlers.DataHandler;
import com.sii.handlers.JsonHandler;
import com.sii.objects.MovieLibrary;

public class Main {
    public static void main(String[] args) {
        MovieLibrary movieLibrary = new MovieLibrary();
        ProgramAction programAction = new ProgramAction();

        DataHandler.fillMoviesData(JsonHandler.getJson("movie"), movieLibrary);
        programAction.startProgram(movieLibrary);
    }
}