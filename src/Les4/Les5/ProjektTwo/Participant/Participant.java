package Les4.Les5.ProjektTwo.Participant;

public class Participant implements Moveable {
    private final String name;
    private final int MAX_LENGTH;
    private final int MAX_HEIGHT;

    public Participant(String name, int MAX_LENGTH, int MAX_HEIGHT) {
        this.name = name;
        this.MAX_LENGTH = MAX_LENGTH;
        this.MAX_HEIGHT = MAX_HEIGHT;
    }

    public void run() {
        System.out.println("Бег");
    }

    public void jump() {
        System.out.println("Прыжок");
    }

    public int getMAX_LENGTH() {
        return MAX_LENGTH;
    }

    public int getMAX_HEIGHT() {
        return MAX_HEIGHT;
    }

    public String getName() {
        return name;
    }
}
