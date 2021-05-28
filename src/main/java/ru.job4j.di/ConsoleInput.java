package ru.job4j.di;

import java.util.Scanner;

public class ConsoleInput {
    private Scanner scanner = new Scanner(System.in);

    public String read(String message) {
        System.out.println(message);
        return scanner.nextLine();
    }
}
