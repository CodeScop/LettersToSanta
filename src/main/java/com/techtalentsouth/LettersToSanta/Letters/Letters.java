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
	private String naughtyOrNice;
	private String letterEntry;
	private String address;

	@Override
	public String toString() {
		return "Letters [name=" + name + ", naughtyOrNice=" + naughtyOrNice + ", letterEntry=" + letterEntry
				+ ", address=" + address + "]";
	}

	public void Letter(String name, String behavior, String letterEntry, String address) {
		this.name = name;
		this.naughtyOrNice = naughtyOrNice;
		this.letterEntry = letterEntry;
		this.address= address;
	}
	
	
	
	public Letters() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNaughtyOrNice() {
		return naughtyOrNice;
	}

	public void setNaughtyOrNice(String naughtyOrNice) {
		this.naughtyOrNice = naughtyOrNice;
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
