package ru.yandex.qa3.staticmod;

public class Converter {
    private static final int CALORIES_PER_STEP = 50;
    public double stepsToKilometers(int steps) {
        //...
        return 0;
    }

    public static double stepsToKcal(int steps) {
        return steps * CALORIES_PER_STEP * 1000;
    }
}
