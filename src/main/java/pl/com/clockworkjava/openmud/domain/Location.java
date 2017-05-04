package pl.com.clockworkjava.openmud.domain;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Location {

    private final String longDescription;
    private final String shortDescription;

    private Map<Direction,Location> neighbours = new HashMap<>();

    public Location(String shortDescription, String longDescription) {
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
    }

    public void addExit(Direction direction, Location location) {
        neighbours.put(direction,location);
    }

    public Optional<Location> getNextLocation(Direction direction) {
        return Optional.ofNullable(neighbours.get(direction));
    }

    public String description() {

        List<String> exits = neighbours.keySet().stream().map(dir -> dir.name).collect(Collectors.toList());

        return shortDescription+"\n"+longDescription+"\n"+"Visible exits: "+String.join(",",exits);
    }

}
