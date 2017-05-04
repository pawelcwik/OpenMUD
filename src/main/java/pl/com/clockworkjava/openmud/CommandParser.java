package pl.com.clockworkjava.openmud;

import pl.com.clockworkjava.openmud.domain.Direction;
import pl.com.clockworkjava.openmud.domain.Player;

public class CommandParser {

    public static boolean parseCommand(boolean keepRunning, Player player, String command) {
        switch(command) {
            case "quit":
                keepRunning = false;
                break;
            case "n":
                move(player, Direction.N);
                break;
            case "s":
                move(player,Direction.S);
                break;
            case "e":
                move(player,Direction.E);
                break;
            case "w":
                move(player,Direction.W);
                break;
            case "u":
                move(player,Direction.U);
                break;
            case "d":
                move(player,Direction.D);
                break;
        }
        return keepRunning;
    }

    private static void move(Player player, Direction direction) {
        if(player.move(direction)) {
            System.out.println(player.getCurrentLocationDescription());
        } else {
            System.out.println("There is no exit in this direction.");
        }
    }
}
