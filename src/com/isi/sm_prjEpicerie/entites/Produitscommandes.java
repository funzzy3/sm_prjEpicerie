package com.isi.sm_prjEpicerie.entites;

/*
	Table produitscommandes
	=======================
	noProduit, noCommande, qteProduitCommande, prixPaye
	-----------------------
	noProduit    BIGINT
	noCommande   BIGINT
	qteProduitCommande INT
	prixPaye     DOUBLE
 */
public class Produitscommandes {
	private int noProduit;
	private int noCommande;
	private int qteProduitCommande;
	private double prixPaye;
	
	public Produitscommandes() {
		this.noProduit = -1;
	}

	public Produitscommandes(int noProduit, int noCommande,
			int qteProduitCommande, double prixPaye) {
		super();
		this.noProduit = noProduit;
		this.noCommande = noCommande;
		this.qteProduitCommande = qteProduitCommande;
		this.prixPaye = prixPaye;
	}

	public int getNoProduit() {
		return noProduit;
	}

	public void setNoProduit(int noProduit) {
		this.noProduit = noProduit;
	}

	public int getNoCommande() {
		return noCommande;
	}

	public void setNoCommande(int noCommande) {
		this.noCommande = noCommande;
	}

	public int getQteProduitCommande() {
		return qteProduitCommande;
	}

	public void setQteProduitCommande(int qteProduitCommande) {
		this.qteProduitCommande = qteProduitCommande;
	}

	public double getPrixPaye() {
		return prixPaye;
	}

	public void setPrixPaye(double prixPaye) {
		this.prixPaye = prixPaye;
	}
}
