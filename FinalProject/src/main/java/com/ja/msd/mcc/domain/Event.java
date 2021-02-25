package com.ja.msd.mcc.domain;



public class Event {
	private long id; 
	private String code;
	private String title;
	private String description;
		
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
