package com.anusha.testing;

import com.anusha.teams.Player;
import com.anusha.teams.Team;

import java.util.ArrayList;
import java.util.List;

public class TeamApp {
    public static void main(String[] args) {
      Team teamRCB=new Team("RCB","BLR");

      Player kohli=new Player("virat","kohli",32,147855l);
      //sphoneNumber long antha declare maadidiya ... so you should give l at the end .... 123l

        Player manoj=new Player("manoj","kumar",42,74852l);

        ArrayList<Player> players=new ArrayList<>();
        players.add(kohli);
        players.add(manoj);

        teamRCB.setPlayers(players);

        List<Player>  bnglrPlayers = teamRCB.getPlayers();


        for(Player player:bnglrPlayers)
        {
            // print name and list of phone numberss
            System.out.println("Person address is: "+player.getPhoneNumbers()                     )  ;

        }



    }
}
