
//import java.util.Comparator;
//import java.util.Collections;
import java.util.*;

//import java.util.Collections;
public class Players_management {
	ArrayList<Players> createpalyerobj() {
		ArrayList<Players> p = new ArrayList<Players>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total Number of Players You want to Print their details");
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			System.out.println("Enter player name ");
			String name = sc.next();
			System.out.println("Enter Players total run");
			int totalRun = sc.nextInt();
			System.out.println("Enter no of wickets");
			int no_of_wickets = sc.nextInt();
			System.out.println("Enter no of mathces");
			int no_of_matches = sc.nextInt();
			System.out.println("Enter Player Country");
			String country = sc.next();
			System.out.println("Enter no of Century");
			int century = sc.nextInt();
			System.out.println("Enter Player category");
			String Category = sc.next();
			p.add(new Players(name, totalRun, no_of_wickets, century, Category, century));
		}
		
		
		return p;
	}

	void display(ArrayList<Players> p) {
		for (Players ele : p) {
			ele.display();
		}
	}

//SortByName
	
	void sortByName(ArrayList<Players> p) 
	{
		Collections.sort(p, new sortbyplayername());
		System.out.println("Players sorted by name:");
		for (Players player : p) {
			System.out.println(player.name + " " + player.totalRun);
		}
	}
	
	
//* Remove the player who has scored less than 100 runs 

	void Removelessrun(ArrayList<Players> p) 
	{
		int pos = 0;
		ArrayList<Players> temp = new ArrayList<Players>();
//		Iterator<Players> iterator = p.iterator();
//		while (iterator.hasNext()) {
//			Players p1 = iterator.next();
		for(Players pl : p)
			
			if (pl.totalRun < 100) 
			{
				pos = p.indexOf(pl);
				temp.add(p.get(pos));
				System.out.println(pos);
			} 
			p.removeAll(temp);			
		}
	void updateplayer(ArrayList<Players> p)
	{
		for(Players p3 : p)
		{
			if(p3.no_of_century>=10)
			{
				System.out.println("Student Got Grade A");
			}
			else
			{
				System.out.println("Student Got Grade B");
			}
		}
		
	}
}

