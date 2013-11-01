package domain;
import javax.persistence.*;
@Entity
@Table(name="MANAGER")
public class Manager extends Person{
	
	Restaurant restaurant;
	
	String phone;
	String address;
	
	public Restaurant getRestaurant() {
		return restaurant;
	}
	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	} 
}
