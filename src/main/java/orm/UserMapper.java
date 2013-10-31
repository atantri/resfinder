package orm;
import java.sql.*;


import domain.User;

public class UserMapper extends DataMapper{
/*
	public void insert(User u)
	{
		try
		{
			sql="insert into user(id,emailid,password,lastlogintime,lastlogouttime,name,rank) values (?,?,?,?,?,?,?)";
			ps=conn.prepareStatement(sql);
			ps.setString(1,u.getId());
			ps.setString(2, u.getEmailId());
			ps.setString(3,u.getPassword());
			ps.setDate(4,new Date(u.getLastLoginTime().getTime()));
			ps.setDate(5,new Date(u.getLastLogoutTime().getTime()));
			ps.setString(6,u.getName());
			ps.setInt(7,u.getRank());
			ps.execute();
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
	}
	public void update(User u)
	{
		try
		{
			sql="update user set userid=?,emailid=?,password=?,logintime=?,logouttime=?,name=?,rank=?";
			ps=conn.prepareStatement(sql);
			ps.setString(1,u.getId());
			ps.setString(2, u.getEmailId());
			ps.setString(3,u.getPassword());
			Date d = new Date(0);
			ps.setDate(4,d);
			ps.setDate(5,d);
			ps.setString(6,u.getName());
			ps.setInt(7,u.getRank());
			ps.execute();
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
	}
	
	public void delete(int id)
	{
		try
		{
			sql="delete from user where userid="+id;
			s.execute(sql);
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
	}
	public void getbyId(int id)
	{
		try
		{
			sql="select * from user where userid="+id;
			s.execute(sql);
		}
		catch(SQLException e)
		{
			System.out.println("e");
		}
	}*/
}
