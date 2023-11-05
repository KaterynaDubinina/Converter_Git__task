package app.view;

import app.entity.Input;

import java.util.Locale;
import java.util.Scanner;

public class AppView {
    public Input getData() {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.print("To convert miles to km enter value: ");
        double value = scanner.nextDouble();
        return new Input(value);
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}