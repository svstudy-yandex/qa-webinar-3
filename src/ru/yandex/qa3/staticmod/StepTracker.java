package ru.yandex.qa3.staticmod;

public class StepTracker {
    private final Converter converter;

    StepTracker() {
        converter = new Converter();
    }

    public double getCaloriesByMonth(int month) {
        int steps = 0;
        //...
        return converter.stepsToKcal(steps);
    }
}
