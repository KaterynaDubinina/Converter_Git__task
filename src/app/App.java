package app;

import app.controller.AppController;

import java.util.Scanner;

public class App {

    static Scanner scanner;

    public static void main(String[] args) {
        runConverter(getConverter());
    }

    private static int getConverter(){
        System.out.print("""
                Press:
                1 - If you want to convert miles to km.
                2 - If you want to convert km to miles.
                """);
        scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static void runConverter(int converter) {
        switch (converter) {
            case 1 -> {
                AppController controller = new AppController();
                controller.getMiles();
            }
            default -> System.out.println("No such option");
        }
    }

}