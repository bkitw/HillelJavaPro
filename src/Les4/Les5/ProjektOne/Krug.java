package Les4.Les5.ProjektOne;

public class Krug implements Faigura{

    private int radius;

    public Krug(int radius) {
        this.radius = radius;
    }

    @Override
    public void pl() {
        int result = (int) (Math.PI*Math.pow(radius,2));
        System.out.println(result);
    }
}
