package com.MvcDemo.entity;
import javax.persistence.*;
@Entity
@Table (name="login")
public class Loginentity 
{
	@Column (name="Id")
	private int id;
	
	
	@Column(name="Uname")
	private String Uname=" ";
	
	
	@Column(name="pword")
	private String pword=" ";


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUname() {
		return Uname;
	}


	public void setUname(String uname) {
		Uname = uname;
	}


	public String getPword() {
		return pword;
	}


	public void setPword(String pword) {
		this.pword = pword;
	}


	@Override
	public String toString() {
		return "Loginentity [id=" + id + ", Uname=" + Uname + ", pword=" + pword + "]";
	}
	
	
	
	
}


