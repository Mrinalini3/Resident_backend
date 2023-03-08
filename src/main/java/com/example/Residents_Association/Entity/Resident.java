package com.example.Residents_Association.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Residents_association")
public class Resident {
	@Id
    @Column(name="id")
    private int id;
    
    @Column(name="Name")
    private String name;
    
    @Column(name="House_Name")
    private String hname;
    
    @Column(name="Street_name")
    private String sname;
    
    @Column(name="DOB")
    private String dob;
    
    @Column(name="Occupation")
    private String oname;
    
    @Column(name="Mobile")
    private int mob;
    
    @Column(name="Mail")
    private String mail;
    
    
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHname() {
		return hname;
	}
	public void setHname(String hname) {
		this.hname = hname;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getOname() {
		return oname;
	}
	public void setOname(String oname) {
		this.oname = oname;
	}
	public int getMob() {
		return mob;
	}
	public void setMob(int mob) {
		this.mob = mob;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public Resident() {}
    public Resident(int id,String name,String hname,String sname,String dob,String oname,int mob) {
    	super();
    	this.id=id;
    	this.name=name;
    	this.hname=hname;
    	this.sname=sname;
    	this.dob=dob;
    	this.oname=oname;
    	this.mob=mob;
    }
}
