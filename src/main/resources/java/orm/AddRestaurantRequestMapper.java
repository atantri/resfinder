package orm;
import java.sql.*;



import javax.persistence.*;
import domain.AddRestaurantRequest;

public class AddRestaurantRequestMapper extends DataMapper{
/*
public void insert(AddRestaurantRequest request)
{
try
{
	EntityManagerFactory entityManagerFactory =  Persistence.createEntityManagerFactory("testjpa");
    EntityManager em = entityManagerFactory.createEntityManager();
    EntityTransaction userTransaction = em.getTransaction();
    
}
catch(Exception e)
{
System.out.println(e);
}
}
public void update(AddRestaurantRequest request)
{
try
{
sql="update AddRestaurantRequest set id=?,managerid=?,restaurantName=?,cuisine=?,location=?,status=?";
ps=conn.prepareStatement(sql);
ps.setInt(1,request.getId());
ps.setString(2, request.getManager().getId());
ps.setString(3,request.getRestaurantName());
ps.setString(4,request.getCuisine());
ps.setString(5,request.getAddress());
ps.setString(6,request.getStatus().toString());
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
sql="delete from AddRestaurantRequest where id="+id;
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
sql="select * from AddRestaurantRequest where id="+id;
s.execute(sql);
}
catch(SQLException e)
{
System.out.println("e");
}
}*/
}