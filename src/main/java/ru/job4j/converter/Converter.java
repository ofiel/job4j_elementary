package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float result = value / 70;
        return result;
    }

    public static float rubleToDollar(float value) {
        float result = value / 60;
        return result;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = rubleToDollar(180);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("180 rubles are " + dollar + " dollars.");

        float inputRubToEuro = 140;
        float expectedRubToEuro = 2;
        float outputRubToEuro = Converter.rubleToEuro(inputRubToEuro);
        boolean passedRubToEuro = expectedRubToEuro == outputRubToEuro;
        System.out.println("140 rubles are 2. Test result : " + passedRubToEuro);

        float inputRubToDollar = 180;
        float expectedRubToDollar = 3;
        float outputRubToDollar = Converter.rubleToDollar(inputRubToDollar);
        boolean passedRubToDollar = expectedRubToDollar == outputRubToDollar;
        System.out.println("180 rubles are 3. Test result : " + passedRubToDollar);
    }
}
