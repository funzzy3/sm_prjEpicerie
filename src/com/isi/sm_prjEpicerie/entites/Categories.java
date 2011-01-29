package com.isi.sm_prjEpicerie.entites;

/*
	Table categories
	================
	noCategorie, descriptionCategorie, image
	----------------
	noCategorie  BIGINT
	descriptionCategorie VARCHAR
	image        VARCHAR
 */

public class Categories {
	private int noCategorie;
	private String descriptionCategorie;
	private String image;
	
	public Categories() {
		this.noCategorie = -1;
	}
	
	public Categories(int noCategorie, String descriptionCategorie, String image) {
		super();
		this.noCategorie = noCategorie;
		this.descriptionCategorie = descriptionCategorie;
		this.image = image;
	}

	public int getNoCategorie() {
		return noCategorie;
	}

	public void setNoCategorie(int noCategorie) {
		this.noCategorie = noCategorie;
	}

	public String getDescriptionCategorie() {
		return descriptionCategorie;
	}

	public void setDescriptionCategorie(String descriptionCategorie) {
		this.descriptionCategorie = descriptionCategorie;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
}
