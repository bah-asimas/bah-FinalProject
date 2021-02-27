package com.ja.msd.mcc.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EVENTS")
public class Event {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id; 
	
	@Column(name="CODE")
	private String code;
	
	@Column(name="TITLE")
	private String title;
	
	@Column(name="DESCRIPTION")
	private String description;
		
	public Event() {
		// TODO Auto-generated constructor stub
	}
	public Event(Long id, String code, String title, String description)
	{
		super();
		this.id = id;
		this.code = code;
		this.title = title;
		this.description = description;
	}
	
	public Long getId()
	{
		return id;
	}
	
	public void setID(long id)
	{
		this.id = id;
	}
	
	public Long getCode()
	{
		return id;
	}
	
	public void setCode(String code)
	{
		this.code = code;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public void setDescription(String description)
	{
		this.description = description;
	}
}
