package pl.com.clockworkjava.openmud;

import pl.com.clockworkjava.openmud.domain.Player;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        MapGenerator.generateWorld();

        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;

        Player player = new Player(MapGenerator.getStartLoc());

        System.out.println(player.getCurrentLocationDescription());

        while(keepRunning) {
            String line = scanner.nextLine();
            keepRunning = CommandParser.parseCommand(keepRunning, player, line);
        }

        scanner.close();
    }



}
