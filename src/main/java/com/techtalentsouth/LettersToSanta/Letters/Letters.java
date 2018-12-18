package com.techtalentsouth.LettersToSanta.Letters;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Letters {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private boolean nice;
	private String naughtyOrNice;
	private String letterEntry;
	private String address;

	@Override
	public String toString() {
		return "Letters [name=" + name + ", nice=" + nice + ", naughtyOrNice=" + naughtyOrNice +", letterEntry=" + letterEntry
				+ ", address=" + address + "]";
	}

	
	public Letters() {
		// TODO Auto-generated constructor stub
	}
	public void Letter(String name, boolean nice, String letterEntry, String address) {
		this.name = name;
		this.nice = nice;
		this.letterEntry = letterEntry;
		this.address= address;
		if(nice) {
			this.naughtyOrNice = "nice :)";
		}else {
			this.naughtyOrNice = "naughty :(";
		}
	}

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean getNice() {
		return nice;
	}

	public void setNice(boolean nice) {
		this.nice = nice;
		if(nice) {
			this.naughtyOrNice = "nice :)";
		}else {
			this.naughtyOrNice = "naughty :(";
		}
	}
	
	public String getNaughtyOrNice() {
		return naughtyOrNice;
	}

	public String getLetterEntry() {
		return letterEntry;
	}

	public void setLetterEntry(String letterEntry) {
		this.letterEntry = letterEntry;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
