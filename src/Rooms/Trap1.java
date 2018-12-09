package Rooms;

import Game.Runner;
import People.Person;

public class Trap1 extends Room
{

    public Trap1 (int trapx1, int trapy1) {
        super(trapx1, trapy1);



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
