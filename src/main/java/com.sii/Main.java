package com.sii;

public class Main {
    public static void main(String[] args) {
        MovieLibrary movieLibrary = new MovieLibrary();
        ProgramAction programAction = new ProgramAction();

        DataGenerator.fillData(JsonHandler.getJson("movie"), movieLibrary);
        programAction.startProgram(movieLibrary);
    }
}