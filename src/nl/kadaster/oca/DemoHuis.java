package nl.kadaster.oca;

public class DemoHuis {
	public static  void main (String[] args){
//		Huis huisA = new Huis("Keulenstraat", 11);		// zal constructor op regel 12 uitvoeren (zonder parameters / signature)
//		huisA.straat = "Keulenstraat";
//		huisA.huisnummer = 11;
		
		//De class wordt in de static environment geladne bij of het 1e keer benaderen van de static members of bij de 1e new Class()
		
		Stad apeldoorn = new Stad();
		apeldoorn.wijk.straat.huis.huisnummer = 12;
		
		Stad steden[] = new Stad[10];					// maakt een nieuwe laden kast met plaats voor 10 laden
	}
}

class Stad{
	Stad(){												// constructor
		System.out.println("Stad-constructor regel A");
	}
	Wijk wijk = new Wijk();
	String naam;
}


class Wijk{
	Wijk(){												// constructor
		System.out.println("Wijk-constructor regel B");
	}
	Straat straat = new Straat();
	String naam;
}

class Straat{
	Straat(){												// constructor
		System.out.println("Straat-constructor regel C");
	}
	Huis huis = new Huis();
	String naam;
}

class Huisnummer{
	int nummer;
}

class Huis{
	String straat;										// shadowing
	int huisnummer;
	
	Huis(String straat, int huisnummer){				// constructor
		System.out.println("Huis-constructor regel D");
		this.straat = straat;							// shadowing
		this.huisnummer = huisnummer;
	}
	
	Huis(String straat){								//constructor
		this(straat,  0);
		System.out.println("Huis-constructor regel E");
	}
	
	Huis(int huisnummer){								//constructor
		this("<onbekend>",  huisnummer);
		System.out.println("Huis-constructor regel F");
	}

	Huis(){								//constructor
		this("<onbekend>",  0);
		System.out.println("Huis-constructor regel G");
	}
}