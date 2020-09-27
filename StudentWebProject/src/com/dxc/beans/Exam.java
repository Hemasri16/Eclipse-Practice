package com.dxc.beans;

public class Exam {

	int id;
	String name;

	public Exam() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Exam(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}	
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
	
	@Override
	public String toString() {
		return "Exam [id=" + id + ", name=" + name + "]";
	}
	public int compareTo(Exam o)	{
		return this.id - o.id;
    }
    public String toCSV() {
    	return id+", "+name;
    }
}
    	
   

