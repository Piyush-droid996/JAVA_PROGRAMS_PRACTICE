import java.util.ArrayList;
import java.util.Scanner;
public class Players {

	String name;
	int totalRun;
	int no_of_wickets;
	int no_of_matches;
	String country;
	int no_of_century;
//	String Category;

	Players(String name, int totalRun, int no_of_wickets, int no_of_matches, String country, int no_of_century) {

		this.name = name;
		this.totalRun = totalRun;
		this.no_of_wickets = no_of_wickets;
		this.no_of_matches = no_of_matches;
		this.country = country;
		this.no_of_century = no_of_century;
//		this.Category = Category;
	}

	public void display() 
	{
		
		
		System.out.println("player name is " + name);
		System.out.println("player totalrun is " + totalRun);
		System.out.println("player no of wickets is " + no_of_wickets);
		System.out.println("player no of matches is " + no_of_matches);
		System.out.println("player country " + country);
		System.out.println("player no of century is " + no_of_century);
//		System.out.println("player name is " + Category);
	}

	
}
