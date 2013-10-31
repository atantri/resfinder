package orm;
import java.sql.*;


import domain.Review;

public class ReviewMapper extends DataMapper{
/*
	public void insert(Review review)
	{
		try
		{
			sql="insert into review(id,restaurantid,userid,datetimeadded,content,upvotes,downvotes,category) values (?,?,?,?,?,?,?,?)";
			ps=conn.prepareStatement(sql);
			ps.setInt(1,review.getId());
			ps.setInt(2, review.getRestaurant().getId());
			ps.setString(3,review.getUser().getId());
			ps.setDate(4,new Date(review.getDateTimeAdded().getTime()));
			ps.setString(5, review.getContent());
			ps.setInt(6,review.getUpVotes());
			ps.setInt(7,review.getDownVotes());
			ps.setString(8, review.getCategory().toString());
			ps.execute();
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
	}
	public void update(Review review)
	{
		try
		{
			sql="update review set id=?,restaurantid=?,userid=?,datetimeadded=?,content=?,upvotes=?,downvotes=?,category=?";
			ps=conn.prepareStatement(sql);
			ps.setInt(1,review.getId());
			ps.setInt(2, review.getRestaurant().getId());
			ps.setString(3,review.getUser().getId());
			ps.setDate(4,(Date)review.getDateTimeAdded());
			ps.setString(5, review.getContent());
			ps.setInt(6,review.getUpVotes());
			ps.setInt(7,review.getDownVotes());
			ps.setString(8, review.getCategory().toString());
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
			sql="delete from review where id="+id;
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
			sql="select * from review where id="+id;
			s.execute(sql);
		}
		catch(SQLException e)
		{
			System.out.println("e");
		}
	}*/
}
