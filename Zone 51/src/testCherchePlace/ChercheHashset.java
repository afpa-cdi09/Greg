package testCherchePlace;

import java.util.HashSet;

public class ChercheHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet <String> listePlace = new HashSet();

		listePlace.add("B");
		listePlace.add("A");
		listePlace.add("D");
		listePlace.add("E");
		listePlace.add("C");
		listePlace.add("F");
		System.out.println(listePlace);
		
	//	boolean test = listePlace.contains("Z") ;
		
	
		
		listePlace.remove("B") ;
		
		System.out.println(listePlace) ;
		
		
		listePlace.add("B") ;
		
		System.out.println(listePlace) ;

	}

}
