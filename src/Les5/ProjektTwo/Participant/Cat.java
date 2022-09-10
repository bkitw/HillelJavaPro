package Les5.ProjektTwo.Participant;

public class Cat extends Participant {


    public Cat(String name, int MAX_LENGTH, int MAX_HEIGHT) {
        super(name, MAX_LENGTH, MAX_HEIGHT);
    }

    @Override
    public void run() {
        System.out.print("Учасник "+super.getName()+" (кот) пробежал");

    }

    @Override
    public void jump() {
        System.out.print("Учасник "+super.getName()+" (кот) перепрыгнул");

    }


}
