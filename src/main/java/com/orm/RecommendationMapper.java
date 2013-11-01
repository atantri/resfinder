package orm;
import java.sql.*;


import domain.Recommendation;

public class RecommendationMapper extends DataMapper{
/*
	public void insert(Recommendation recommendation)
	{
		try
		{
			sql="insert into recommendation(id,restaurantid,userid,dateadded) values (?,?,?,?)";
			ps=conn.prepareStatement(sql);
			ps.setInt(1,recommendation.getId());
			ps.setInt(2, recommendation.getRestaurant().getId());
			ps.setString(3,recommendation.getUser().getId());
			ps.setDate(4,new Date(recommendation.getDateAdded().getTime()));
			ps.execute();
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
	}
	public void update(Recommendation recommendation)
	{
		try
		{
			sql="update recommendation set id=?,restaurantid=?,userid=?,dateadded=?";
			ps=conn.prepareStatement(sql);
			ps.setInt(1,recommendation.getId());
			ps.setInt(2, recommendation.getRestaurant().getId());
			ps.setString(3,recommendation.getUser().getId());
			ps.setDate(4,(Date)recommendation.getDateAdded());
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
			sql="delete from recommendation where id="+id;
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
			sql="select * from recommendation where id="+id;
			s.execute(sql);
		}
		catch(SQLException e)
		{
			System.out.println("e");
		}
	}*/
}
