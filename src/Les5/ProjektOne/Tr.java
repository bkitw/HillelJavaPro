package Les5.ProjektOne;

public class Tr implements Faigura {

    private int stor1;
    private int stor2;
    private int stor3;

    public Tr(int stor1, int stor2, int stor3) {
        this.stor1 = stor1;
        this.stor2 = stor2;
        this.stor3 = stor3;
    }

    @Override
    public void pl() {
        int result = stor1 + stor2 + stor3;
        System.out.println(result);
    }
}
