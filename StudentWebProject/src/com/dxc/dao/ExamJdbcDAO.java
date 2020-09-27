package com.dxc.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.dxc.beans.Exam;
import com.dxc.util.ConnectionManager;
import com.mysql.jdbc.Statement;

public class ExamJdbcDAO extends JdbcDAO implements DAO<Exam> {

	Connection con=null;
	PreparedStatement p=null;
	ResultSet rs=null;
	
	public ExamJdbcDAO() throws FileNotFoundException, IOException, ClassNotFoundException, SQLException
	{
		super();
	}
	@Override
	public boolean save(Exam e) throws Exception {
		boolean res=false;
		
		p=con.prepareStatement("insert into mark vales(?,?)");
		p.setInt(1, e.getId());
		p.setString(2, e.getName());
		
		if(1==p.executeUpdate())
		{
			res=true;
		}
		// TODO Auto-generated method stub
		return res;
	}

	@Override
	public boolean edit(Exam e) throws Exception {
		// TODO Auto-generated method stub
		boolean res=false;
		p=con.prepareStatement("update mark set name=? where id=?");
		p.setString(1, e.getName());
		p.setInt(2, e.getId());
		if(1==p.executeUpdate())
		{
			res=true;
		}
		return res;
	}

	@Override
	public boolean delete(int id) throws Exception {
		// TODO Auto-generated method stub
		boolean res=false;
		p.getConnection().prepareStatement("delete from mark where id=?");
		p.setInt(1,id);
		if(1==p.executeUpdate())
		{
			res=true;
		}
		return res;
	}

	@Override
	public Exam find(int id) throws Exception {
		// TODO Auto-generated method stub
		Exam exam=null;
		p=con.prepareStatement("select * from mark where id=? ");
		p.setInt(1,id);
		rs=p.executeQuery();
		if(rs.next())
		{
			String name=rs.getString(2);
			exam = new Exam(id,name); 
		}
		return exam;
	}

	@Override
	public List<Exam> findAll() throws SQLException,ParseException {
		ArrayList<Exam> exams=new ArrayList<>();
		
		Statement stmt=(Statement) con.createStatement();
		rs=stmt.executeQuery("select * from mark");
		while(rs.next())
		{
			int id=rs.getInt("id");
			String name=rs.getString("name");
			Exam exam=new Exam(id, name);
			exams.add(exam);
			
		}
		// TODO Auto-generated method stub
		return exams;
	}

}