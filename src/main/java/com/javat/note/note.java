package com.javat.note;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="notes")
public class note implements Serializable{
	
	@Id
	
	@Column (name="title",length = 500)
	private String title;
	
	@Column (name = "content" ,length = 500)
      private String content;
	
	@Column (name ="date",length = 10)
	private String date;
	
	public note() {
		super();
	}
	public  note(String title, String content,String date) {
	super();
	
	this.title = title;
	this.content = content;
	this.date =date;
	}
		

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	

	
}
