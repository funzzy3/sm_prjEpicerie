package com.isi.sm_prjEpicerie.entites;

/*
	Table produits
	==============
	noProduit, descriptionProduit, qteProduit, formatProduit, prixCoutant, prixVendu, noCategorie
	--------------
	noProduit    BIGINT
	descriptionProduit VARCHAR
	qteProduit   INT
	formatProduit VARCHAR
	prixCoutant  DOUBLE
	prixVendu    DOUBLE
	noCategorie  BIGINT
 */
public class Produits {
	private int noProduit;
	private String descriptionProduit;
	private int qteProduit;
	private String formatProduit;
	private double prixCoutant;
	private double prixVendu;
	private int noCategorie;
	
	public Produits() {
		this.noProduit = -1;
	}

	public Produits(int noProduit, String descriptionProduit, int qteProduit,
			String formatProduit, double prixCoutant, double prixVendu,
			int noCategorie) {
		super();
		this.noProduit = noProduit;
		this.descriptionProduit = descriptionProduit;
		this.qteProduit = qteProduit;
		this.formatProduit = formatProduit;
		this.prixCoutant = prixCoutant;
		this.prixVendu = prixVendu;
		this.noCategorie = noCategorie;
	}

	public int getNoProduit() {
		return noProduit;
	}

	public void setNoProduit(int noProduit) {
		this.noProduit = noProduit;
	}

	public String getDescriptionProduit() {
		return descriptionProduit;
	}

	public void setDescriptionProduit(String descriptionProduit) {
		this.descriptionProduit = descriptionProduit;
	}

	public int getQteProduit() {
		return qteProduit;
	}

	public void setQteProduit(int qteProduit) {
		this.qteProduit = qteProduit;
	}

	public String getFormatProduit() {
		return formatProduit;
	}

	public void setFormatProduit(String formatProduit) {
		this.formatProduit = formatProduit;
	}

	public double getPrixCoutant() {
		return prixCoutant;
	}

	public void setPrixCoutant(double prixCoutant) {
		this.prixCoutant = prixCoutant;
	}

	public double getPrixVendu() {
		return prixVendu;
	}

	public void setPrixVendu(double prixVendu) {
		this.prixVendu = prixVendu;
	}

	public int getNoCategorie() {
		return noCategorie;
	}

	public void setNoCategorie(int noCategorie) {
		this.noCategorie = noCategorie;
	}
}
