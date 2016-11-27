public class Garagiste{
	
	private String nom;
	private String adresse;
	
	public Garagiste(String nom, String adresse){
		this.nom = nom;
		this.adresse = adresse;
	}
	
	public void getNom(){
		return this.nom;
	}
	
	public void getAdresse(){
		return this.adresse;
	}
}
