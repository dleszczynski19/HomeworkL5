package com.sii.handlers;

import java.util.Scanner;

public class InputHandler {
    static Scanner scanner = new Scanner(System.in);

    public enum TextColor {
        RESET("\u001B[0m"), GREEN("\u001B[32m"), BLUE("\u001B[34m"),
        RED("\u001B[31m");

        private final String colorIndex;

        TextColor(String colorIndex) {
            this.colorIndex = colorIndex;
        }

        public String getColor() {
            return colorIndex;
        }
    }

    public static String geInput(String... sentence) {
        if (sentence.length == 1) System.out.println(sentence[0]);
        return scanner.nextLine();
    }
}