package com.example;

public class RockPaperScissors {

	public static void main(String[] args) {
		System.out.println(rps("rock", "rock")); //tie
		System.out.println(rps("rock", "paper")); //p2 wins
		System.out.println(rps("rock", "scissors")); //p1 wins
		System.out.println(rps("paper", "rock")); //p1 wins
		System.out.println(rps("paper", "paper")); //tie
		System.out.println(rps("paper", "scissors")); //p2 wins
		System.out.println(rps("scissors", "rock")); //p2 wins
		System.out.println(rps("scissors", "paper")); //p1 wins
		System.out.println(rps("scissors", "scissors")); //tie
	}
	
	public static String rps(String s1, String s2) {
		if (s1.equals(s2)) {
			return "TIE";
		}
		else if ((s1.equals("rock") && s2.equals("paper")) || 
				(s1.equals("paper") && s2.equals("scissors")) || 
				(s1.equals("scissors") && s2.equals("rock"))) {
			return "Player 2 wins";
		}
		else if ((s1.equals("rock") && s2.equals("scissors")) || 
				(s1.equals("paper") && s2.equals("rock")) || 
				(s1.equals("scissors") && s2.equals("paper"))) {
			return "Player 1 wins";
		}
		else {
			return "error";
		}
	}

}
