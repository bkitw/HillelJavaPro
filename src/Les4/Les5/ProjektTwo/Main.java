package Les4.Les5.ProjektTwo;


import Les4.Les5.ProjektTwo.Obstacle.Obstacle;
import Les4.Les5.ProjektTwo.Obstacle.Treadmil;
import Les4.Les5.ProjektTwo.Obstacle.Wall;
import Les4.Les5.ProjektTwo.Participant.Cat;
import Les4.Les5.ProjektTwo.Participant.Human;
import Les4.Les5.ProjektTwo.Participant.Participant;
import Les4.Les5.ProjektTwo.Participant.Robot;

public class Main {
    public static void main(String[] args) {

        Participant[] participants = new Participant[3];
        participants[0] = new Human("Bob", 1500, 2);
        participants[1] = new Robot("Wally", 10000, 0);
        participants[2] = new Cat("Simba", 500, 2);

        Obstacle[] obstacles = new Obstacle[5];
        obstacles[0] = new Treadmil(500);
        obstacles[1] = new Wall(1);
        obstacles[2] = new Treadmil(1000);
        obstacles[3] = new Treadmil(5000);
        obstacles[4] = new Wall(2);

        for (int i = 0; i < participants.length; i++) {
            int round = i;
            System.out.println();
            System.out.println("Учасник " + ++round + ":");
            for (int j = 0; j < obstacles.length; j++) {
                if (obstacles[j] instanceof Treadmil) {
                    if (participants[i].getMAX_LENGTH() >= ((Treadmil) obstacles[j]).getLENGTH()) {
                        participants[i].run();
                        ((Treadmil) obstacles[j]).overcome();
                    } else {
                        System.out.println("Учасник " + participants[i].getName() + " НЕ смог пройти препятствие "
                                + ((Treadmil) obstacles[j]).getNAME_OBSTACLE() + " длинной "
                                + ((Treadmil) obstacles[j]).getLENGTH() + " метров и был исключён.");
                        break;
                    }
                } else {
                    if (participants[i].getMAX_HEIGHT() >= ((Wall) obstacles[j]).getHEIGHT()) {
                        participants[i].jump();
                        ((Wall) obstacles[j]).overcome();
                    } else {
                        System.out.println("Учасник " + participants[i].getName() + " НЕ смог пройти препятствие "
                                + ((Wall) obstacles[j]).getNAME_OBSTACLE() + " высотой "
                                + ((Wall) obstacles[j]).getHEIGHT() + " метров и был исключён.");


                        break;
                    }
                }
            }

        }

    }
}
