package pl.com.clockworkjava.openmud.domain;

public enum Direction {
    N("North"),
    S("South"),
    E("East"),
    W("West"),
    U("Up"),
    D("Down");

    public final String name;

    Direction(String name) {
        this.name = name;
    }
}
