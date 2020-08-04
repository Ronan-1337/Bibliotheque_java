package fr.ronan;

import lombok.Data;

@Data
public class Enbois {
	private int id;
	private int longueur;
	private int largeur;
	private String matiere;
	
	public Enbois(int id, int longueur, int largeur, String matiere) {
		super();
		this.id = id;
		this.longueur = longueur;
		this.largeur = largeur;
		this.matiere = matiere;
	}
	
	public Enbois() {
		
	}
	
}
