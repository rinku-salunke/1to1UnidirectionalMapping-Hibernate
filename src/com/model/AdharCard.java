package com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class AdharCard {
	
@Id
private int aid;
private String aName;

public int getAid() {
	return aid;
}
public void setAid(int aid) {
	this.aid = aid;
}
public String getaName() {
	return aName;
}
public void setaName(String aName) {
	this.aName = aName;
}
}
