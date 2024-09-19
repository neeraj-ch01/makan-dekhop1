package com.univ.DAO;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

import com.univ.DB.*;
import com.DTO.CustRegDTO;
import com.univ.DAO.*;

public class CustRegDAO {

public int save1(CustRegDTO t1)
{
	int x=0;
	try {
	Connection con1=DBConnection.getConn();
	
	PreparedStatement ps=con1.prepareStatement
("insert into customer(cname,cadd,cemail,mob,salpur,unm,pw) values(?,?,?,?,?,?,?)");
	ps.setString(1, t1.getCname());
	   ps.setString(2, t1.getCadd());
	   ps.setString(3, t1.getCemail());
	   ps.setInt(4, t1.getMob());
	   ps.setInt(5, t1.getSalpur());
	    ps.setString(6, t1.getUnm());
	   ps.setString(7, t1.getPw());
	   x=ps.executeUpdate();
	
	}catch(Exception tt)
	{System.out.println(tt);}
	return x;
}
public Vector loginChck(CustRegDTO lg) {
	Vector data=new Vector();
	try {
		String qry="select * from customer where unm=? and pw=?";
		Connection con=DBConnection.getConn();
		PreparedStatement ps=con.prepareStatement(qry);
		ps.setString(1, lg.getUnm());
		 ps.setString(2, lg.getPw());
		 ResultSet rs=  ps.executeQuery();  	
	     if(rs.next())
     {
      data.add(rs.getInt(1));
      data.add(rs.getString(2));
      data.add(rs.getString(3));
      data.add(rs.getString(4));
      data.add(rs.getInt(5));
      data.add(rs.getInt(6));
      data.add(rs.getString(7));
      data.add(rs.getString(8));
     }
	}catch(Exception tt)
	{System.out.println(tt) ;}
	System.out.print(data);
	return data;
}
}
