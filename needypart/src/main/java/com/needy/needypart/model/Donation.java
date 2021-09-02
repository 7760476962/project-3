package com.needy.needypart.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Donation  {
	@Id
	
	private int dId;
	private String dName;
	private int dQuantity;
	private String dDate;
	public Donation() {
		// TODO Auto-generated constructor stub
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public int getdQuantity() {
		return dQuantity;
	}
	public void setdQuantity(int dQuantity) {
		this.dQuantity = dQuantity;
	}
	public String getdDate() {
		return dDate;
	}
	public void setdDate(String dDate) {
		this.dDate = dDate;
	}
	public Donation(String dName, int dQuantity, String dDate) {
		super();
		this.dName = dName;
		this.dQuantity = dQuantity;
		this.dDate = dDate;
	}
	@Override
	public String toString() {
		return "Donation [dName=" + dName + ", dQuantity=" + dQuantity + ", dDate=" + dDate + "]";
	}
	

}
