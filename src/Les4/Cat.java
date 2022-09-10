package Les4;

public class Cat extends Animal {

    private static int catCount;

    public Cat(String name) {
        super(name);
        catCount++;
    }

    public void run(int dist) {
        if (dist>0&&dist <= 200) {
            super.run(dist);
        } else if (dist <=0) {
            System.out.println("Значение неверно");
        }else System.out.println(super.getName()+ " не может пробежать "+ dist +" м.");

    }
    public void swim(int dist){
        System.out.println("Коты не умеют плавать.");
    }

    public static int getCatCount() {
        return catCount;
    }

    public static void setCatCount(int catCount) {
        Cat.catCount = catCount;
    }
}
