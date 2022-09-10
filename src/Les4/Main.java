package Les4;



public class Main {
    public static void main(String[] args) {
        Cat simba = new Cat("Simba");
        simba.run(200);
        simba.swim(34);
        System.out.println("----------");

        Cat simba1 = new Cat("Simba");
        simba1.run(0);
        simba1.swim(10);
        System.out.println("----------");

        Cat simba2 = new Cat("Simba");
        simba2.run(201);
        simba2.swim(1);
        System.out.println("----------");
        System.out.println("----------");

        Dog bobik = new Dog("Bobik");
        bobik.run(500);
        bobik.swim(10);
        System.out.println("----------");

        Dog bobik1 = new Dog("Bobik");
        bobik1.run(501);
        bobik1.swim(11);
        System.out.println("----------");

        Dog bobik2 = new Dog("Bobik");
        bobik2.run(0);
        bobik2.swim(0);
        System.out.println("----------");

        System.out.println(Cat.getCatCount());
        System.out.println(Dog.getDogCount());
        System.out.println(Animal.getCountAnimals());

    }

}
