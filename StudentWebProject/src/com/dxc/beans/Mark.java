package com.dxc.beans;
public class Mark {

	int studentid;
	int examid;
	int sub1;
	int sub2;
	int sub3;

	public Mark() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mark(int studentid, int examid,int sub1,int sub2,int sub3) {
		super();
		this.studentid = studentid;
		this.examid = examid;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
	}
	public int getstudentId() {
		return studentid;
	}
	public void setstudentId(int studentid) {
		this.studentid = studentid;
	}
	public int getexamid() {
		return examid;
	}
	public void setexamid(int examid) {
		this.examid = examid;
	}
	public int getsub1() {
		return sub1;
	}
	public void setsub1(int sub1) {
		this.sub1 = sub1;
	}
	public int getsub2() {
		return sub2;
	}
	public void setsub2(int sub2){
		this.sub2 = sub2;
	}
	public int getsub3() {
		return sub3;
	}
	public void setsub3(int sub3) {
		this.sub3=sub3;
	}
	@Override
	public String toString() {
		return "Mark [studentid=" + studentid + ", examid=" + examid + ", sub1" + sub1 + ", sub2=" + sub2 + ", sub3=" + sub3
				+ "]";
	}
	public int compareTo(Mark o)	{
		return this.studentid - o.studentid;
    }
    public String toCSV() {
    	return studentid+", "+examid+", "+sub1+", "+sub2+", "+sub3;
    }
}
    	
   

