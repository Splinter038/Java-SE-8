package nl.kadaster.oca;

public class BosProgramma {
	public static void main(String[] args){

		Bos bos1 = new Bos();
		Bos bos2 = new Bos();

		bos1.naam= "Zwarte Woud";
		bos2.naam= "Veluwe";
		bos1.setAantalBomen(12, false);
		bos1.setAantalBomen(150, true);
		bos2.setAantalBomen(3000, true);

		System.out.println(bos1.naam + ": " + bos1.getAantalBomen() + " bomen.");
		System.out.println(bos2.naam + ": " + bos2.getAantalBomen() + " bomen.");
	}
}

//}	void setAantalRuiten(int ruiten){			// encapsulation stap 2
//	if (ruiten < 3){
//		aantalRuiten = 3;
//		System.out.println("moet wettelijk minimaal 3");
//	}
//	else{
//		aantalRuiten = ruiten;
//	}
//}
//
//int getAantalRuiten(){						// encapsulation stap 3
//	return aantalRuiten;
//}