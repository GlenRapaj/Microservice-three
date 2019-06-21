package com.glen.GetBookListMicroService4.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EconomicData")
public class EconomicData {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="teardhura")
	private double teardhura;
	
	@Column(name="shpenzime")
	private double shpenzime;
	
	@Column(name="isbn")
	private int isbn;
	
	@Column(name="diferenca")
	private double diferenca;

	public EconomicData() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getTeardhura() {
		return teardhura;
	}

	public void setTeardhura(double teardhura) {
		this.teardhura = teardhura;
	}

	public double getShpenzime() {
		return shpenzime;
	}

	public void setShpenzime(double shpenzime) {
		this.shpenzime = shpenzime;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public double getDiferenca() {
		return diferenca;
	}

	public void setDiferenca(double diferenca) {
		this.diferenca = diferenca;
	}

	@Override
	public String toString() {
		return "EconomicData [id=" + id + ", teardhura=" + teardhura + ", shpenzime=" + shpenzime + ", isbn=" + isbn
				+ ", diferenca=" + diferenca + "]";
	}
	
	
	
}
