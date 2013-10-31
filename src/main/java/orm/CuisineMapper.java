package orm;
import java.sql.*;


import domain.Cuisine;

public class CuisineMapper extends DataMapper{
/*
	public void insert(Cuisine cuisine)
	{
		try
		{
			sql="insert into Cuisine(id,name,description) values (?,?,?)";
			ps=conn.prepareStatement(sql);
			ps.setInt(1,cuisine.getId());
			ps.setString(2, cuisine.getName());
			ps.setString(3,cuisine.getDescription());
			ps.execute();
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
	}
	public void update(Cuisine cuisine)
	{
		try
		{
			sql="update Cuisine set id=?,name=?,description=?";
			ps=conn.prepareStatement(sql);
			ps.setInt(1,cuisine.getId());
			ps.setString(2, cuisine.getName());
			ps.setString(3,cuisine.getDescription());
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
			sql="delete from Cuisine where id="+id;
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
			sql="select * from Cuisine where id="+id;
			s.execute(sql);
		}
		catch(SQLException e)
		{
			System.out.println("e");
		}
	}*/
}
