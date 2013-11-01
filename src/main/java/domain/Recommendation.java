package domain;
import java.util.*;
import javax.persistence.*;
@Entity
public class Recommendation  {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="REC_SEQ")
	int id;
	@OneToMany(mappedBy="User")
	User user;
	@OneToMany(mappedBy="Restaurant")
	Restaurant restaurant;
	Date dateAdded;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Restaurant getRestaurant() {
		return restaurant;
	}
	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
	public Date getDateAdded() {
		return dateAdded;
	}
	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
	}
}
