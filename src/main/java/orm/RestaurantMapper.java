package orm;
import java.sql.*;

import javax.persistence.*;

import domain.Restaurant;

public class RestaurantMapper extends DataMapper{

	/*public void insert(Restaurant restaurant)
	{
		try
		{
			sql="insert into restaurant(id,name,rating,address,locationId) values (?,?,?,?,?)";
			ps=conn.prepareStatement(sql);
			ps.setInt(1,restaurant.getId());
			ps.setString(2, restaurant.getName());
			ps.setInt(3,restaurant.getRating());
			ps.setString(4,restaurant.getAddress());
			ps.setInt(5,restaurant.getLocation().getId());
			ps.execute();
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
	}
	public void update(Restaurant restaurant)
	{
		try
		{
			sql="update restaurant set id=?,name=?,rating=?,address=?,locationId=?";
			ps=conn.prepareStatement(sql);
			ps.setInt(1,restaurant.getId());
			ps.setString(2, restaurant.getName());
			ps.setInt(3,restaurant.getRating());
			ps.setString(4,restaurant.getAddress());
			ps.setInt(5,restaurant.getLocation().getId());
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
			sql="delete from restaurant where id="+id;
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
			sql="select * from restaurant where id="+id;
			s.execute(sql);
		}
		catch(SQLException e)
		{
			System.out.println("e");
		}
	}*/
	
	
	
}
