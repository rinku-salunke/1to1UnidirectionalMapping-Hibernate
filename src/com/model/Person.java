package com.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Person {
	
@Id
private int pid;
private String pName;

@OneToOne(cascade = CascadeType.ALL)
private AdharCard ad;

public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getpName() {
	return pName;
}
public void setpName(String pName) {
	this.pName = pName;
}
public AdharCard getAd() {
	return ad;
}
public void setAd(AdharCard ad) {
	this.ad = ad;
}

}
