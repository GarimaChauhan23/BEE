package com.server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.client.GreetingService;
import com.shared.Add;
import com.shared.Books;
import com.shared.Data;
import com.shared.Log;
import com.shared.outuser;
import com.shared.upl;
import com.sun.java.swing.plaf.windows.resources.windows;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * The server-side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class GreetingServiceImpl extends RemoteServiceServlet implements GreetingService {


	Connection con = null;
	Statement st = null;
	PreparedStatement preparedStmt;
	public void init() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/project", "root", "");
			System.out.println("Databse is connected");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			st = con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/*
	 * { try { Class.forName("com.mysql.jdbc.Driver"); con =
	 * DriverManager.getConnection("jdbc:mysql://localhost/user","root","");
	 * System.out.println("Databse is connected");
	 */
	@Override
	public Add getsubmit(Add name) throws IllegalArgumentException {
		init();
		String s1 = name.cname;
		String s2 = name.oname;
		String s3 = name.email;
		String s4 = name.add;
		int s5 = name.pno;
		String s6 = name.login;
		String s7 = name.pass;

		String query = "INSERT INTO `cafe` (`cname`, `oname`, `eadd`, `add`, pno , `lid`, `pass`)"
				+ " values (?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement preparedStmt;
		try {
			preparedStmt = con.prepareStatement(query);
			preparedStmt.setString(1, s1);
			preparedStmt.setString(2, s2);
			preparedStmt.setString(3, s3);
			preparedStmt.setString(4, s4);
			preparedStmt.setInt(5, s5);
			preparedStmt.setString(6, s6);
			preparedStmt.setString(7, s7);

			preparedStmt.execute();
			System.out.println("query fired");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return name;

	}

	public Data p(Data n) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		init();
		Data ss = n;

		String s1 = n.fname;
		String s2 = n.lname;
		String s3 = n.uid;
		String s4 = n.add;
		int s5 = n.pno;
		String s6 = n.pass;

		String query = "INSERT INTO `user` (`fname`, `lname`, `u_id`, `add`, `pno`, `pass`)"
				+ " values (?, ?, ?, ?, ?,?)";
		PreparedStatement preparedStmt;
		try {
			preparedStmt = con.prepareStatement(query);
			preparedStmt.setString(1, s1);
			preparedStmt.setString(2, s2);
			preparedStmt.setString(3, s3);
			preparedStmt.setString(4, s4);
			preparedStmt.setInt(5, s5);
			preparedStmt.setString(6, s6);

			preparedStmt.execute();
			System.out.println("query fired");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ss;

	}

	public Log l(Log u) throws IllegalArgumentException {
		String s1 = u.uid;
		String s2 = u.pass;
		Boolean s3 = u.cb;
		System.out.println(s3);
		if (s3.equals(false)) {
			String query = "SELECT u_id, pass FROM user where u_id=? and pass=?";

			PreparedStatement ps;
			try {
				ps = con.prepareStatement(query);
				ps.setString(1, s1);
				ps.setString(2, s2);
				ResultSet results = ps.executeQuery();

				if (results.next()) {
					System.out.println("query fired");
				} else {
					Window.alert("incorrect login id & password");
				}
				results.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block

				e.printStackTrace();
			}

			return u;

		} else {
			String query = "SELECT lid, pass FROM cafe where lid=? and pass=?";

			PreparedStatement ps;
			try {
				ps = con.prepareStatement(query);
				ps.setString(1, s1);
				ps.setString(2, s2);
				ResultSet results = ps.executeQuery();

				if (results.next()) {
					System.out.println("query fired");
				} else {
					Window.alert("incorrect login id & password");
				}
				results.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block

				e.printStackTrace();
			}

			return u;
		}
	}

	@Override
	public upl insert(upl u) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		init();

		String s1 = u.getC();
		String s2 = u.getO();
		String s3= u.getC1();
		String ss = "NO";
		int k = 0;
		try {
			k = st.executeUpdate("insert into cupload values('" + s1 + "','" + s2 + "','"+s3+"')");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (k != 0)
			ss = "OK";

		u.setC((s1 + "JIIIIII"));

		return u;

		/*
		 * upl xw=u; String s1=xw.c; String s2=xw.o;
		 * 
		 * 
		 * 
		 * String query = "INSERT INTO `cupload` ( cname, offer) " + " values (?, ?)";
		 * PreparedStatement preparedStmt; try { preparedStmt =
		 * con.prepareStatement(query); preparedStmt.setString(1, s1);
		 * preparedStmt.setString(2, s2);
		 * 
		 * 
		 * 
		 * preparedStmt.execute(); System.out.println("query fired"); } catch
		 * (SQLException e) { // TODO Auto-generated catch block e.printStackTrace(); }
		 * return xw;
		 * 
		 */

	}

	@Override
	public Add[] po(String s) throws IllegalArgumentException {
		
		init();
		Add jj[] = new Add[100];
		int i = 0;
		ResultSet rs = null;
		try {
			rs = st.executeQuery("select 'cname' from cafe where city= '" + s + "'");
			System.out.println("executed");
			while (rs.next()) {
				jj[i] = new Add();
				jj[i].setCname(rs.getString(1));
				/*jj[i].setSubcaty(rs.getString(4));
				jj[i].setName(rs.getString(3));
				jj[i].setDesct(rs.getString(5));
				jj[i].setCafe(rs.getString(6));*/
				i++;
			}
		} catch (SQLException ee) {
			System.out.println(ee.getMessage());
		}

		return jj;
		
		
		// TODO Auto-generated method stub

	}

	@Override
	public outuser getdata(outuser name) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		init();
		Log l = new Log();
		String s1 = l.uid;
		String s2 = l.pass;
		String query = "SELECT fname, lname FROM user where u_id=? and pass=?";
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(query);
			ps.setString(1, s1);
			ps.setString(2, s2);
			ResultSet results = ps.executeQuery();

			while (results.next()) {
				String s3 = results.getString("fname");
				String s4 = results.getString("lname");
			}
			results.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
		}

		return name;

	}

	@Override
	public Books[] fun(String s1) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		init();
		Books jj[] = new Books[100];
		int i = 0;
		ResultSet rs = null;
		try {
			rs = st.executeQuery("select * from books where city= '" + s1 + "'");
			while (rs.next()) {
				jj[i] = new Books();
				jj[i].setCaty(rs.getString(2));
				jj[i].setSubcaty(rs.getString(4));
				jj[i].setName(rs.getString(3));
				jj[i].setDesct(rs.getString(5));
				jj[i].setCafe(rs.getString(6));
				i++;
			}
		} catch (SQLException ee) {
			System.out.println(ee.getMessage());
		}

		return jj;
	}
	

	@Override
	public Books fun1(Books s1) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		init();
		
		Books bb = new Books();
		String ss1 = bb.getCaty();
		String ss2 = bb.getName();
		String ss3 = bb.getSubcaty();
		String ss4 = bb.getDesct();
		//String ss5 = bb.getCafe();
		String ss6 = bb.getCity();
				
		String query =  "INSERT INTO `books` (`caty`, `name`, `subname`, `dscrt`, `city`)"
				+ " values (?, ?, ?, ?,?)";
				
		PreparedStatement ins ;
		 try {
			ins = con.prepareStatement(query);
			ins.setString(1, ss1);
			ins.setString(2, ss2);
			ins.setString(3, ss3);
			ins.setString(4, ss4);
			//ins.setString(5, ss5);
			ins.setString(6, ss6);
			 ins.execute();
			 Window.alert("book recieved");
			 System.out.println("query fired");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return s1;
	}
  
}
