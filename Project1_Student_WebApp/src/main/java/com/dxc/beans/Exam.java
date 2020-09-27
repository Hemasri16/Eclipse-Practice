package com.dxc.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "exam")
public class Exam {
	@Id
	@GeneratedValue
	String eid;
	String ename;

	public Exam() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Exam(String eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	@Override
	public String toString() {
		return "Exam [eid=" + eid + ", ename=" + ename + "]";
	}

}
