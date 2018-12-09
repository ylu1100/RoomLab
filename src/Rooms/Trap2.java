package Rooms;

import Game.Runner;
import People.Person;

public class Trap2 extends Room
{

    public Trap2 (int trapx2, int trapy2) {
        super(trapx2, trapy2);



    }


    /**
     * Triggers the game ending conditions.
     * @param x the Person entering
     */
    @Override
    public void enterRoom(Person x) {

        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("You stepped into a trap. Game Over");
        Runner.gameOff();
    }


}
