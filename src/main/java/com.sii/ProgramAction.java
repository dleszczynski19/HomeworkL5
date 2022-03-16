package com.sii;

import java.util.Random;
import java.util.Scanner;

public class ProgramAction {
    Scanner scanner = new Scanner(System.in);

    public void startProgram(MovieLibrary movieLibrary){
        MenuHandler.displayMenu();
        int programIndex = scanner.nextInt();
        switch (programIndex){
            case 1:
                System.out.println("Wybrałeś opcję pokaż filmy z danego przedziału lat. Wpisz rok od:");
                int yearFrom = scanner.nextInt();
                System.out.println("Wpisz rok do:");
                int yearTo = scanner.nextInt();
                movieLibrary.printByFilter(movieLibrary.filterByDate(yearFrom, yearTo));
                break;
            case 2:
                System.out.println("Wybrałeś opcję pokaż informację o losowym filmie.");
                movieLibrary.printRandomFilm();
                break;
            case 3:
                scanner = new Scanner(System.in);
                System.out.println("Wybrałeś opcję pokaż filmy dla danego aktora. Wpisz imię: ");
                String name = scanner.nextLine();
                System.out.println("Wpisz nazwisko:");
                String lastName = scanner.nextLine();
                movieLibrary.printByActors(name, lastName);
                break;
            default:
        }
    }
}
