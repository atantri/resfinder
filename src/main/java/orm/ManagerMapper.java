package orm;
import java.sql.*;


import domain.Manager;

public class ManagerMapper extends DataMapper{
/*
	public void insert(Manager manager)
	{
		try
		{
			sql="insert into manager(id,restaurantId,phone,address) values (?,?,?,?)";
			ps=conn.prepareStatement(sql);
			ps.setString(1,manager.getId());
			ps.setInt(2, manager.getRestaurant().getId());
			ps.setString(3,manager.getPhone());
			ps.setString(4,manager.getAddress());
			ps.execute();
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
	}
	public void update(Manager manager)
	{
		try
		{
			sql="update manager set id=?,restaurantid=?,phone=?,addrss=?";
			ps=conn.prepareStatement(sql);
			ps.setString(1,manager.getId());
			ps.setInt(2, manager.getRestaurant().getId());
			ps.setString(3,manager.getPhone());
			ps.setString(4,manager.getAddress());
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
			sql="delete from manager where id="+id;
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
			sql="select * from manager where id="+id;
			s.execute(sql);
		}
		catch(SQLException e)
		{
			System.out.println("e");
		}
	}*/
}
