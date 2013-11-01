package domain;
import java.util.*;
import javax.persistence.*;
@Entity

public class Restaurant {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="RES_SEQ")
	int id;
	String name;
	Manager manager;
	@OneToMany
	List<Cuisine> cuisines;
	String address;
	@OneToMany
	Location location;
	int rating;
	@OneToMany(cascade=CascadeType.ALL)
	List<Review> reviews;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Manager getManager() {
		return manager;
	}
	public void setManager(Manager manager) {
		this.manager = manager;
	}
	public List<Cuisine> getCuisines() {
		return cuisines;
	}
	public void setCuisines(List<Cuisine> cuisines) {
		this.cuisines = cuisines;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public List<Review> getReviews() {
		return reviews;
	}
	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}
}
