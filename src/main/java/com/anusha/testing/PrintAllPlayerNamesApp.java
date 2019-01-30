package com.anusha.testing;

import com.anusha.teams.Player;
import com.anusha.teams.Team;

import java.util.*;

import static java.util.Collections.*;

public class PrintAllPlayerNamesApp {
    public static void main(String[] args) {
        // 1. this create a team object
        Team teamRCB = new Team("RCB", "BLR");

// 2. this creates a list
        List<Integer> viraTNumbers = Arrays.asList(1231231231, 708770078);
        List<Integer> manojNumbers = Arrays.asList(8547896, 159789654);
        List<Integer> tarunNumbers = Arrays.asList(248965712, 789654123);

        //this creates object of player
        Player kohli = new Player("virat", "kohli", 32, viraTNumbers);
        Player manoj = new Player("manoj", "kumar", 62, manojNumbers);
        Player tarun = new Player("tarun", "prasad", 22, tarunNumbers);

//3. this creates list and adds to list
        ArrayList<Player> players = new ArrayList<>();
        players.add(kohli);
        players.add(manoj);
        players.add(tarun);

//4. this assigns players to team
        teamRCB.setPlayers(players);
//5. this takes players details
        List<Player> bnglrPlayers = teamRCB.getPlayers();
//6. prints name and phonenumber of players
        for (Player player : bnglrPlayers) {
            //7.  print name and list of phone numberss
            System.out.println(player.getFirstName() + " - " + player.getPhoneNumbers());
        }

    }
}
