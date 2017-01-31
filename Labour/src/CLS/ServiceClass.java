package CLS;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import CLS.User;
import Conn.ConnectionClass;

public class ServiceClass extends ConnectionClass{
	
	
	
User uj= new User();
	
	public String checkPassword2(String name, String password)
	{
		this.getConnection();
		
		String sql = "select Pass from Labour where Id =?";
		try
		{
			ps = connection.prepareStatement(sql);
			ps.setString(1, name);
			rs=ps.executeQuery();
			while (rs.next())
			{
				
				if(rs.getString(1).equals(password))
				{
					return "success";
				}
			}
//			
	
		}
		catch(SQLException e)
		{
			return "fail";
		}
	
		return "fail";
	}
	
	
	
	
	
	public String checkDistrict(String name)
	{
		this.getConnection();
		
		String sql = "select name from District where name=?";
		try
		{
			ps = connection.prepareStatement(sql);
			ps.setString(1, name);
			rs=ps.executeQuery();
			while (rs.next())
			{
				
				if(rs.getString(1).equals(name))
				{
					return "success";
				}
			}
//			
	
		}
		catch(SQLException e)
		{
			return "fail";
		}
	
		return "fail";
	}

	
	
	
	
	public User check_2(String id) {
		String ll,pp,jj,mm,lp,ss;
		
		
		this.getConnection();
		
		String sql ="select * from input where Id='"+id+"'";
		try
		{
			ps = connection.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while (rs.next())
			{
			   lp=rs.getString("Id");
			   ll=rs.getString("Name");
			   jj=rs.getString("Pass");
			   ss=rs.getString("mob");
			  
			  
			   uj.setId(lp);
			   uj.setName(ll);
			   uj.setPass(jj);
			   uj.setMob(ss);
			  
			   
			   
				return uj;
			}
			ps.close();
			rs.close();
			connection.close();
		
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	
	
	
	public void Insert(String name, String id, String pass,String mob,String wag){
		this.getConnection();
	
		
			String sql = "insert into Labour (Name,Id,Pass,Mobile,Wage) values(?,?,?,?,?)";
			try
			{
				ps = connection.prepareStatement(sql);
				ps.setString(1, name);
				ps.setString(2, id);
				
				ps.setString(3, pass);
				
				ps.setString(4, mob);
				
				ps.setString(5, wag);
		
				ps.executeUpdate();
				
				ps.close();
				connection.close();
				
			}
			catch(SQLException e)
			{
			 e.printStackTrace();	
			}	
					
		
	}
	
	
	
	
	
public void Delete(String id) {
		
		this.getConnection();
		String sql="delete from Labour where Id='"+id+"'";
		try
		{
			ps = connection.prepareStatement(sql);
			//ps.setString(1, id);
			//ps.setString(1, name);
			//ps.setString(2, location);
			ps.executeUpdate();
			
			ps.close();
			connection.close();
			
		}
		catch(SQLException e)
		{
		 e.printStackTrace();	
		}		
	}


public User check(String id) {
	String ll,kk,pp,jj,ss,mm,ng,lp,sss;
	
	
	this.getConnection();
	
	String sql ="select * from Labour where Id='"+id+"'";
	try
	{
		ps = connection.prepareStatement(sql);
		rs = ps.executeQuery();
		
		while (rs.next())
		{
			lp=rs.getString("Id");
			ll=rs.getString("Name");
		   
			jj=rs.getString("Pass");
		   
		   ss=rs.getString("Mobile");
		  
		   mm=rs.getString("Wage");
		   uj.setId(lp);
		   uj.setName(ll);
		  
		   uj.setPass(jj);
		   
		   uj.setMob(ss);
		   
		   uj.setW(mm);
		   
		   return uj;
		}
		ps.close();
		rs.close();
		connection.close();
	
	}catch (SQLException e) {
		e.printStackTrace();
	}
	return uj;
}

	

public void Update(String name, String dept, String qli,String m,String w) {
	// TODO Auto-generated method stub
	this.getConnection();
	//String sq="update input set Name='"+name+"',Id='"+dept+"', Email='"+qli+"', Pass='"+puni+"', Dept='"+de+"', CGPA='"+cg+"'  where Id='"+dept+"'";
	String sql="update Labour set Name='"+name+"',Id='"+dept+"', Pass='"+qli+"', Mobile='"+m+"' , Wage='"+w+"' where Id='"+dept+"'";
	System.out.println(name +" "+dept);
	try
	{
		ps = connection.prepareStatement(sql);
		//ps.setString(1, id);
		//ps.setString(1, name);
		//ps.setString(2, location);
		ps.executeUpdate();
		
		ps.close();
		connection.close();
		
	}
	catch(SQLException e)
	{
	 e.printStackTrace();	
	}	
}
	


public List<User> InsertDB() {
	List<User> list = new ArrayList<User>();
	User uj = null;
	this.getConnection();
	
	String sql ="select *from Labour order by Id asc";
	
	try
	{
		ps = connection.prepareStatement(sql);
		rs = ps.executeQuery();
		
		while (rs.next())
		{
			uj = new User();
			
			
			uj.setName(rs.getString(1));
			uj.setId(rs.getString(2));
			uj.setPass(rs.getString(3));
			uj.setMob(rs.getString(4));
			uj.setW(rs.getString(5));

			
			
			list.add(uj);
		}
		ps.close();
		rs.close();
		connection.close();
		return list;
		
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
	return null;
}



}
