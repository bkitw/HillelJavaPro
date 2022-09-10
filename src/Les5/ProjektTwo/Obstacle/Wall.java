package Les5.ProjektTwo.Obstacle;

public class Wall extends Obstacle {
    private final int HEIGHT;
    private final String NAME_OBSTACLE = "\"Стена\"";

    public Wall(int HEIGHT) {
        this.HEIGHT = HEIGHT;
    }
    public void overcome() {
        System.out.println(" стену высотой " + HEIGHT + " метров.");
    }

    public int getHEIGHT() {
        return HEIGHT;
    }

    public String getNAME_OBSTACLE() {
        return NAME_OBSTACLE;
    }
}
