package orm;
import java.io.File;






import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

import javax.persistence.*;

import domain.Restaurant;
import parseXml.XmlParser;

abstract class DataMapper {

	static final String JDBC_DRIVER = "org.h2.Driver"; 
	Connection conn = null;
	Statement s;
	PreparedStatement ps;
	EntityManagerFactory entityManagerFactory;
	EntityManager em;
	EntityTransaction userTransaction;
	DataMapper()
	{
		entityManagerFactory =  Persistence.createEntityManagerFactory("resfinder_jpa");
		em = entityManagerFactory.createEntityManager();
	}
	void close()
	{
		 em.close();
		 entityManagerFactory.close();
	}
	public void insert(Object obj)
	{
		
		 userTransaction = em.getTransaction();
		 em.persist(obj);
		 userTransaction.commit();
	
	}
	public void delete(int id,String str)
	{
		try
		{
			Class clas=Class.forName(str);
			Object obj=clas.newInstance();
			obj=em.find(clas, id);
			em.remove(obj);
		}
		catch(Exception e)
		{
			System.out.println("Caught Exception"+e);
		}
		
	}
	public Object findbyId(int id,String str)
	{
		try
		{
			Class clas=Class.forName(str);
			Object obj=clas.newInstance();
			obj=em.find(clas, id);
			return obj;
		}
		catch(Exception e)
		{
			System.out.println("Caught Exception"+e);
		}
		finally
		{
			return null;
		}
	}

	

	/*DataMapper()
	{ 
		try{
			Properties prop = new Properties();
			prop.load(new FileInputStream(new File(System.getProperty("user.home")+"/config.properties")));
			String DB_URL = prop.getProperty("dbUrl");
			String USER = prop.getProperty("dbUser");
			String PASSWORD = prop.getProperty("dbPassword");
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
			s = conn.createStatement();
//			s.execute(sql);
		   }
		   catch(Exception E)
		   {
			   System.out.println("Caught "+E);
		   }		     
	}
	public void close()
	{
		try
		{
			conn.close();
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
	}*/
		
}
