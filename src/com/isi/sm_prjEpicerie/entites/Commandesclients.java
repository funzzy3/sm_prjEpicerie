package com.isi.sm_prjEpicerie.entites;

/*
	Table commandesclients
	======================
	noCommande, totalCommande, noClient
	----------------------
	noCommande   BIGINT
	totalCommande DOUBLE
	noClient     BIGINT
 */
public class Commandesclients {
	private int noCommande;
	private double totalCommande;
	private int noClient;
	
	public Commandesclients() {
		this.noCommande = -1;
	}

	public Commandesclients(int noCommande, double totalCommande, int noClient) {
		super();
		this.noCommande = noCommande;
		this.totalCommande = totalCommande;
		this.noClient = noClient;
	}

	public int getNoCommande() {
		return noCommande;
	}

	public void setNoCommande(int noCommande) {
		this.noCommande = noCommande;
	}

	public double getTotalCommande() {
		return totalCommande;
	}

	public void setTotalCommande(double totalCommande) {
		this.totalCommande = totalCommande;
	}

	public int getNoClient() {
		return noClient;
	}

	public void setNoClient(int noClient) {
		this.noClient = noClient;
	}
}
