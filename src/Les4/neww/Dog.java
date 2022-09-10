package Les4.neww;

public class Dog extends Animal {
    private static int countDog;

    public Dog(String name) {
        super(name);
        countDog++;
    }
    public void run(int dist){
        if (dist>0&&dist<=500){
            super.run(dist);
        }
        else System.out.println("Неверное значение");

    }
    public void swim(int dist){
        if (dist>0&&dist<=10){
            super.swim(dist);
        }
        else System.out.println("Неверное значение");

    }

    public static int getCountDog() {
        return countDog;
    }
}
