package Les4;

public class Animal {
     private final String name;

    private static int countAnimals;

    public Animal(String name) {
        this.name = name;
        countAnimals++;

    }

    public String getName() {
        return name;
    }





    public void run(int dist) {
        System.out.println(this.name+" пробежал "+dist+" метров.");

    }

    public  void swim(int dist) {
        System.out.println(this.name+" проплыл "+dist+" метров.");
    }

    public static int getCountAnimals() {
        return countAnimals;
    }



}
