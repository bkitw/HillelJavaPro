package Les4;

public class Dog extends Animal {
    private static int dogCount;

    public Dog(String name) {
        super(name);

        dogCount++;
    }

    public void run(int dist) {

        if (dist > 0 && dist <= 500) {
            super.run(dist);
        } else if (dist <= 0) {
            System.out.println("Значение неверно");
        } else System.out.println(super.getName() + " не может пробежать " + dist + " м.");


    }

    public void swim(int dist) {
        if (dist > 0 && dist <= 10) {
            super.run(dist);
        } else if (dist <= 0) {
            System.out.println("Значение неверно");
        } else System.out.println(super.getName() + " не может проплыть " + dist + " м.");
    }

    public static int getDogCount() {
        return dogCount;
    }

    public static void setDogCount(int dogCount) {
        Dog.dogCount = dogCount;
    }
}
