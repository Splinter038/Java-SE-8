package nl.kadaster.oca;

public class Hoofdstuk3 {
	public static void main(String[] args){
//		Integer mijnInteger = new Integer("");
//		System.out.println(mijnInteger + "!");

		Auto mijnEersteAuto = new Auto();
		mijnEersteAuto.autoSchilderen("zwart");
		System.out.println("De kleur van mijn Eerste Auto = " + mijnEersteAuto.kleur);

		Auto mijnTweedeAuto = new Auto();
		mijnTweedeAuto.autoSchilderen("wit");
		System.out.println("De kleur van mijn Tweede Auto = " + mijnTweedeAuto.kleur);
		
		mijnEersteAuto.besturen();
		
		mijnEersteAuto.setAantalRuiten(-12);
		System.out.println(mijnEersteAuto.getAantalRuiten());
		
		System.out.println("Roulette");
		boolean isGeschilderd = mijnEersteAuto.autoRouletteSchilderen("Goud");
		System.out.println(mijnEersteAuto.kleur);
	}
}

class Auto {
	private int aantalRuiten;					// encapsulation stap 1
	static int aantalWielen = 4;
	String kleur;
	
	
	
	void besturen() {
		System.out.println("Broembroem");
	}
	
	void autoSchilderen(String kleur){				// kleur is method variabele lokaal)
		kleur = kleur;
		System.out.println("We make 'm " + kleur);	// kleur lokaal
		this.kleur = kleur;							// instance variable 
	}	
	
	void setAantalRuiten(int ruiten){			// encapsulation stap 2
		if (ruiten < 3){
			aantalRuiten = 3;
			System.out.println("moet wettelijk minimaal 3");
		}
		else{
			aantalRuiten = ruiten;
		}
	}
	
	int getAantalRuiten(){						// encapsulation stap 3
		return aantalRuiten;
	}
	
	boolean autoRouletteSchilderen(String watVoorKleur){
		int schilderen = (int) (Math.random() * 2);
		if (schilderen == 0){
			return false;
		}else {
			autoSchilderen(watVoorKleur);
			return true;
		}
	}
}