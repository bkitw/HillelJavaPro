package Les3.Car;

public class Car {


    public static void start() {
        startElectric();
        startCommand();
        startFuelSystem();
    }

    private static void startElectric() {
        System.out.println("Старт электрики");
    }

    private static void startCommand() {
        System.out.println("Старт ком");
    }

    private static void startFuelSystem() {
        System.out.println("Старт топ");
    }

}
