package com.courtney;

public class Main {

    public static void main(String[] args) {
	    FootballPlayer percy = new FootballPlayer("Percy Tau");
	    BaseballPlayer eddy = new BaseballPlayer("Eddy Richards");
	    SoccerPlayer paul = new SoccerPlayer("Paul Pogba");

	    Team adelaideCrows = new Team("Adelaide Crows");
	    adelaideCrows.addPlayer(percy);
	    adelaideCrows.addPlayer(eddy);
	    adelaideCrows.addPlayer(paul);

        System.out.println(adelaideCrows.numPlayers());
    }
}
