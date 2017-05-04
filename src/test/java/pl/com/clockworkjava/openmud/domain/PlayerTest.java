package pl.com.clockworkjava.openmud.domain;
import static org.junit.Assert.*;

public class PlayerTest {

    @org.junit.Test
    public void move() throws Exception {
        Location location1 = new Location("First location","You are standing in first room.");
        Location location2 = new Location("Second location","You are standing in second room.");

        location1.addExit(Direction.N, location2);
        location2.addExit(Direction.S, location1);

        Player player = new Player(location1);

        player.move(Direction.N);

        assertEquals(location2.description(),player.getCurrentLocationDescription());
    }

    @org.junit.Test
    public void moveInWrongDirection() throws Exception {
        Location location = new Location("First location","You are standing in first room.");

        Player player = new Player(location);

        assertFalse(player.move(Direction.E));
    }

    @org.junit.Test
    public void getCurrentLocationDescription() throws Exception {
        Location location = new Location("First location","You are standing in first room.");

        Player player = new Player(location);

        assertEquals(location.description(),player.getCurrentLocationDescription());
    }

}