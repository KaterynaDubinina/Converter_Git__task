package app.controller;

import app.entity.Input;
import app.model.ConverterModel;
import app.model.ConverterModelA;
import app.model.ConverterModelB;
import app.view.AppView;

public class AppController {

    public void getMiles() {
        AppView view = new AppView();
        ConverterModel modelA = new ConverterModelA();

        Input input = view.getData();
        double value = input.getValue();
        String result = String.valueOf(modelA.convertValue(value));

        String output = "\n" + value + " mile(s)" +
                "\n\u2B07\uFE0F\u2B07\uFE0F\u2B07\uFE0F\u2B07\uFE0F\u2B07\uFE0F" +
                "\n" + result + " km";
        view.getOutput(output);
    }

    public void getKm() {
        AppView view = new AppView();
        ConverterModel modelB = new ConverterModelB();

        Input input = view.getData();
        double value = input.getValue();
        String result = String.valueOf(modelB.convertValue(value));

        String output = "\n" + value + " km" +
                "\n\u2B07\uFE0F\u2B07\uFE0F\u2B07\uFE0F\u2B07\uFE0F\u2B07\uFE0F" +
                "\n" + result + " miles";
        view.getOutput(output);
    }
}