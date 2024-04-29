import java.util.ArrayList;

public class Players_main {

	public static void main(String[] args) {
		Players_management p = new Players_management();
		ArrayList<Players> a =  p.createpalyerobj();
		p.display(a);	
		p.sortByName(a);
		p.Removelessrun(a);
		p.display(a);
		p.updateplayer(a);
		p.display(a);
		
	}

}
