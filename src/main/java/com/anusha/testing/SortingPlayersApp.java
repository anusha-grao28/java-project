package com.anusha.testing;

import com.anusha.teams.Player;
import com.anusha.teams.Team;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.Collections.sort;

public class SortingPlayersApp {
    public static void main(String[] args) {
        //1. create object of team class
        Team teamRCB = new Team("RCB", "BLR");

        List<Integer> viraTNumbers = Arrays.asList(1231231231, 708770078);
        List<Integer> manojNumbers = Arrays.asList(8547896, 159789654);
        List<Integer> tarunNumbers = Arrays.asList(248965712, 789654123);

        Player kohli = new Player("virat", "kohli", 32, viraTNumbers);
        Player manoj = new Player("manoj", "kumar", 42, manojNumbers);
        Player tarun = new Player("tarun", "prasad", 22, tarunNumbers);


        ArrayList<Player> players = new ArrayList<>();
        players.add(kohli);
        players.add(manoj);
        players.add(tarun);

//4. this assigns players to team
        teamRCB.setPlayers(players);

        //2. get players detailss
        List<Player> bnglrPlayers = teamRCB.getPlayers();
//prints name and phonenumbers of players
        for (Player player : bnglrPlayers) {
            // 3.print name and list of phone numberss
            System.out.println(player.getFirstName() + " - " + player.getPhoneNumbers());
        }
//4. sorts the list of players based on age and prints
        System.out.println("before sorting the list:");
        for (Player player : bnglrPlayers) {
            // 5. print name and list of phone numberss
            System.out.println(player.getFirstName() + " - " + player.getAge());
        }

        System.out.print("after sorting the list:");
        Comparator<Player> ageCompoarator = new Comparator<Player>() {
            @Override
            public int compare(Player player1, Player player2) {
                return player1.getAge() - player2.getAge();
            }
        };

        // List<Player> bnglrplayersSorted =
        sort(bnglrPlayers, ageCompoarator);

        for (Player player : bnglrPlayers) {
            // 6. print name and list of phone numberss
            System.out.println(player.getFirstName() + " - " + player.getAge());
        }
    }
}
