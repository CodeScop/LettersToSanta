package com.techtalentsouth.LettersToSanta.Contact;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contact {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String subject;
	private String message;
	
	
	@Override
	public String toString() {
		return "Contact [id=" + id + ", name=" + name + ", subject=" + subject + ", message=" + message + "]";
	}

	public Contact() {
		//empty constructor
	}

	public Contact(Long id, String name, String subject, String message) {
		super();
		this.id = id;
		this.name = name;
		this.subject = subject;
		this.message = message;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Long getId() {
		return id;
	}
	
	

}
