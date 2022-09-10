package Les4.neww;

public class Cat extends Animal{
    private static int countCat;

    public Cat(String name) {
        super(name);
        countCat++;

    }
    public void run(int dist){
        if (dist>0&&dist<=200){
            super.run(dist);
        }
        else System.out.println("Неверное значение");

    }
    public void swim(int dist){
        System.out.println("Коты не плавают");

    }

    public static int getCountCat() {
        return countCat;
    }
}
