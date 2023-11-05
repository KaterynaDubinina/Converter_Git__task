package app.model;

public class ConverterModelA extends ConverterModel{
    private static final double CONSTANT = 1.60934;

    @Override
    public double convertValue(double value) {
        return value * CONSTANT;
    }
}