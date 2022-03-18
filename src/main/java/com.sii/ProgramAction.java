package com.sii;

import com.sii.handlers.InputHandler;
import com.sii.handlers.XmlHandler;
import com.sii.objects.Actor;
import com.sii.objects.Movie;
import com.sii.objects.MovieLibrary;

import java.util.List;

public class ProgramAction {
    public static void displayMenu() {
        System.out.println("----------------------------------------------------------------------------------\n" +
                "Choose an option:\n" +
                "1. Enter two dates to display the names of movies released between these dates.\n" +
                "2. Display all information about a random movie.\n" +
                "3. Enter the name of the actor to display the names of the movies he starred in.\n" +
                "4. Close program.\n" +
                "----------------------------------------------------------------------------------");
    }

    public void startProgram(MovieLibrary movieLibrary) {
        List<Movie> movies;
        while (true) {
            displayMenu();
            int programIndex = Integer.parseInt(InputHandler.geInput());
            switch (programIndex) {
                case 1:
                    int yearFrom = Integer.parseInt(InputHandler.geInput(InputHandler.TextColor.GREEN +
                            "You have selected the option to show films from a given age range." +
                            InputHandler.TextColor.RESET + "\nEnter year from:"));
                    int yearTo = Integer.parseInt(InputHandler.geInput("Enter year to:"));
                    movies = movieLibrary.getMoviesByDate(yearFrom, yearTo);
                    movieLibrary.printTitle(movies);
                    XmlHandler.serialize(movies, "films" + yearFrom + "_to_" + yearTo);
                    break;
                case 2:
                    System.out.println(InputHandler.TextColor.GREEN + "You have selected the option to show information"
                            + " about random film." + InputHandler.TextColor.RESET);
                    Movie movie = movieLibrary.getRandomMovie();
                    System.out.println(movie);
                    XmlHandler.serialize(movie, "randomMovie");
                    break;
                case 3:
                    String name = InputHandler.geInput(InputHandler.TextColor.GREEN + "You have selected the"
                            + " option to show films for a given actor." + InputHandler.TextColor.RESET
                            + "\nEnter actor name:");
                    String lastName = InputHandler.geInput("Enter last name:");
                    Actor actor = new Actor(name, lastName);
                    movies = movieLibrary.getMoviesByActor(actor);
                    movieLibrary.printTitle(movies);
                    XmlHandler.serialize(movies, actor.toString());
                    break;
                case 4: {
                    System.out.println(InputHandler.TextColor.GREEN + "You closed the program.");
                    return;
                }
                default:
                    System.out.println(InputHandler.TextColor.RED + "You have typed wrong number." +
                            InputHandler.TextColor.RESET);
            }
        }
    }
}