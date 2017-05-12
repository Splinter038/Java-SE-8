package nl.kadaster.oca;

public class Bos {
	String naam;

	void bosMethode(){
		
	}
	
	private int aantalBomen;

	public void setAantalBomen(int aantalBomen, boolean erbij){
		if (erbij){
			this.aantalBomen += aantalBomen;
		}else{
			this.aantalBomen -= aantalBomen;
		}
	}
	
	public int getAantalBomen(){
		return this.aantalBomen;
	}

}
