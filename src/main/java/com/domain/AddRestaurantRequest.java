package domain;
import javax.persistence.*;
@Entity
@Table(name="ADDRESTAURANTREQUEST")
public class AddRestaurantRequest  {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="ADD_SEQ")
	int id;
	@ManyToOne
	Manager manager;
	String restaurantName;
	String address;
	String cuisine;
	RequestStatus status;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Manager getManager() {
		return manager;
	}
	public void setManager(Manager manager) {
		this.manager = manager;
	}
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCuisine() {
		return cuisine;
	}
	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}
	public RequestStatus getStatus() {
		return status;
	}
	public void setStatus(RequestStatus status) {
		this.status = status;
	}
}

