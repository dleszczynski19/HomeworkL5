package com.sii.handlers;

import java.util.Scanner;

public class InputHandler {
    static Scanner scanner = new Scanner(System.in);
    public static final String colorReset = "\u001B[0m";
    public static final String colorGreen = "\u001B[32m";
    public static final String colorBlue = "\u001B[34m";
    public static final String colorRed = "\u001B[31m";

    public static String geInput(String... sentence) {
        if (sentence.length == 1) System.out.println(sentence[0]);
        return scanner.nextLine();
    }
}