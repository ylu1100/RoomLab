package Rooms;

import Game.Runner;
import People.Person;

public class Trap extends Room
{

    public Trap (int trapx, int trapy) {
        super(trapx, trapy);

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
