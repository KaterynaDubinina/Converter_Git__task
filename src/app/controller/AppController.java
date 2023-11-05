package app.controller;

import app.entity.Input;
import app.model.ConverterModel;
import app.model.ConverterModelA;
import app.view.AppView;

public class AppController {

    public void getMiles() {
        AppView view = new AppView();
        ConverterModel modelA = new ConverterModelA();

        Input input = view.getData();
        double value = input.getValue();
        String result = String.valueOf(modelA.convertValue(value));

        String output = value + " mile(s) = " + result + " km";
        view.getOutput(output);
    }
}