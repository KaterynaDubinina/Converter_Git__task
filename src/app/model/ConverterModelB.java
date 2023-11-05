package app.model;

public class ConverterModelB extends ConverterModel{

    private static final double CONSTANT = 0.621371;

    @Override
    public double convertValue(double value) {
        return value * CONSTANT;
    }
}
