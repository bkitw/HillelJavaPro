package Les4.Les5.ProjektTwo.Participant;

public class Human extends Participant {

    public Human(String name, int MAX_LENGTH, int MAX_HEIGHT) {
        super(name, MAX_LENGTH, MAX_HEIGHT);
    }


    @Override
    public void run() {
        System.out.print("Учасник "+super.getName()+" (человек), пробежал");


    }

    @Override
    public void jump() {
        System.out.print("Учасник "+super.getName()+" (человек), перепрыгнул");

    }


}
