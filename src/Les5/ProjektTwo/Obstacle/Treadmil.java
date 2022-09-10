package Les5.ProjektTwo.Obstacle;

public class Treadmil extends Obstacle {
    private final int LENGTH;
    private final String NAME_OBSTACLE = "\"Беговая дорожка\"";

    public Treadmil(int LENGTH) {
        this.LENGTH = LENGTH;
    }

    public void overcome() {
        System.out.println(" по беговой дорожке " + LENGTH + " метров.");
    }

    public int getLENGTH() {
        return LENGTH;
    }

    public String getNAME_OBSTACLE() {
        return NAME_OBSTACLE;
    }
}
