package minu.san.ms;




import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class Db {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","Yug@20204");
String Query="select * from Application";
Statement stmt=con.createStatement();
ResultSet rs =stmt.executeQuery(Query);
while(rs.next())
{
	System.out.println(rs.getString(1)+ " "+rs.getString(2)+" "+rs.getString(3));}
}
//int updateRowCount=stmt.executeUpdate(query);}
		catch(ClassNotFoundException e) {
e.printStackTrace();
	}
	catch(Exception e) {
e.printStackTrace();
	}

}}




