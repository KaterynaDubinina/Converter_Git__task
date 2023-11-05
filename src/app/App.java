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
                \uD83D\uDDA5\uFE0F  Press:
                1\uFE0F\u20E3  to convert miles to km.
                2\uFE0F\u20E3  to convert km to miles.
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
            case 2 -> {
                AppController controller = new AppController();
                controller.getKm();
            }
            default -> System.out.println("No such option");
        }
    }

}