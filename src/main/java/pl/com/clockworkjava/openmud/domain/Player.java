package pl.com.clockworkjava.openmud.domain;

import java.util.Optional;

public class Player {

    private Location currentLocation;

    public Player(Location startLocation) {
        this.currentLocation = startLocation;
    }

    public boolean move(Direction direction) {
        boolean moved = false;
        Optional<Location> next = this.currentLocation.getNextLocation(direction);
        if(next.isPresent()) {
            this.currentLocation = next.get();
            moved = true;
        }
        return moved;
    }

    public String getCurrentLocationDescription() {
        return this.currentLocation.description();
    }
}
