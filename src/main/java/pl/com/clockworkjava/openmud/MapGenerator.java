package pl.com.clockworkjava.openmud;


import pl.com.clockworkjava.openmud.domain.Direction;
import pl.com.clockworkjava.openmud.domain.Location;

public class MapGenerator {

    private static Location startLoc;

    public static Location getStartLoc() {
        return startLoc;
    }

    public static void generateWorld() {

        Location location1 = new Location("First location","You are standing in first room.");
        Location location2 = new Location("Second location","You are standing in second room.");

        startLoc = location1;

        location1.addExit(Direction.N, location2);
        location2.addExit(Direction.S, location1);

    }
}
