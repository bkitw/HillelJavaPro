package Les4.neww;

public class Animal {
    private final String name;
    private static int countAnimal;

    public Animal(String name) {
        this.name = name;
        countAnimal++;
    }
    public void run(int dist){
        System.out.println(this.name+" пробежал "+dist+" м.");

    }
    public void swim(int dist){
        System.out.println(this.name+" проплыл "+dist+" м.");

    }

    public static int getCountAnimal() {
        return countAnimal;
    }
}
