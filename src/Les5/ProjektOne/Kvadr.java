package Les5.ProjektOne;

public class Kvadr implements Faigura{

    private int storona;

    public Kvadr(int storona) {
        this.storona = storona;
    }

    @Override
    public void pl() {
        int result = storona*storona;
        System.out.println(result);
    }
}
