package com.isi.sm_prjEpicerie.entites;

/*
	Table clients
	=============
	noClient, nomClient, prenomClient, noCiviqueClient, rueClient, codePostalClient, villeClient, noCarteCredit, telephoneClient, courrielClient, passwordClient
	-------------
	noClient     BIGINT
	nomClient    VARCHAR
	prenomClient VARCHAR
	noCiviqueClient INT
	rueClient    VARCHAR
	codePostalClient VARCHAR
	villeClient  VARCHAR
	noCarteCredit VARCHAR
	telephoneClient VARCHAR
	courrielClient VARCHAR
	passwordClient VARCHAR
 */
public class Clients {
	private int noClient;
	private String nomClient;
	private String prenomClient;
	private int noCiviqueClient;
	private String rueClient;
	private String codePostalClient;
	private String villeClient;
	private String noCarteCredit;
	private String telephoneClient;
	private String courrielClient;
	private String passwordClient;
	
	public Clients() {
		this.noClient = -1;
	}
	
	public Clients(int noClient, String nomClient, String prenomClient,
			int noCiviqueClient, String rueClient, String codePostalClient,
			String villeClient, String noCarteCredit, String telephoneClient,
			String courrielClient, String passwordClient) {
		super();
		this.noClient = noClient;
		this.nomClient = nomClient;
		this.prenomClient = prenomClient;
		this.noCiviqueClient = noCiviqueClient;
		this.rueClient = rueClient;
		this.codePostalClient = codePostalClient;
		this.villeClient = villeClient;
		this.noCarteCredit = noCarteCredit;
		this.telephoneClient = telephoneClient;
		this.courrielClient = courrielClient;
		this.passwordClient = passwordClient;
	}

	public int getNoClient() {
		return noClient;
	}

	public void setNoClient(int noClient) {
		this.noClient = noClient;
	}

	public String getNomClient() {
		return nomClient;
	}

	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}

	public String getPrenomClient() {
		return prenomClient;
	}

	public void setPrenomClient(String prenomClient) {
		this.prenomClient = prenomClient;
	}

	public int getNoCiviqueClient() {
		return noCiviqueClient;
	}

	public void setNoCiviqueClient(int noCiviqueClient) {
		this.noCiviqueClient = noCiviqueClient;
	}

	public String getRueClient() {
		return rueClient;
	}

	public void setRueClient(String rueClient) {
		this.rueClient = rueClient;
	}

	public String getCodePostalClient() {
		return codePostalClient;
	}

	public void setCodePostalClient(String codePostalClient) {
		this.codePostalClient = codePostalClient;
	}

	public String getVilleClient() {
		return villeClient;
	}

	public void setVilleClient(String villeClient) {
		this.villeClient = villeClient;
	}

	public String getNoCarteCredit() {
		return noCarteCredit;
	}

	public void setNoCarteCredit(String noCarteCredit) {
		this.noCarteCredit = noCarteCredit;
	}

	public String getTelephoneClient() {
		return telephoneClient;
	}

	public void setTelephoneClient(String telephoneClient) {
		this.telephoneClient = telephoneClient;
	}

	public String getCourrielClient() {
		return courrielClient;
	}

	public void setCourrielClient(String courrielClient) {
		this.courrielClient = courrielClient;
	}

	public String getPasswordClient() {
		return passwordClient;
	}

	public void setPasswordClient(String passwordClient) {
		this.passwordClient = passwordClient;
	}
}
