package orm;
import java.sql.*;


import domain.Location;

public class LocationMapper extends DataMapper{
/*
	public void insert(Location location)
	{
		try
		{
			sql="insert into Location(id,name) values (?,?)";
			ps=conn.prepareStatement(sql);
			ps.setInt(1,location.getId());
			ps.setString(2, location.getName());
			ps.execute();
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
	}
	public void update(Location location)
	{
		try
		{
			sql="update Cuisine set id=?,name=?";
			ps=conn.prepareStatement(sql);
			ps.setInt(1,location.getId());
			ps.setString(2, location.getName());
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
			sql="delete from Location where id="+id;
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
			sql="select * from Location where id="+id;
			s.execute(sql);
		}
		catch(SQLException e)
		{
			System.out.println("e");
		}
	}*/
}
