package domain;
import java.util.*;

import javax.persistence.*;
@Entity
public class Review {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="REC_SEQ")
	int id;
	@ManyToOne
	User user;
	@ManyToOne
	Restaurant restaurant;
	int upVotes;
	int downVotes;
	String content;
	ReviewCategory category;
	Date dateTimeAdded;
	
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
	public int getUpVotes() {
		return upVotes;
	}
	public void setUpVotes(int upVotes) {
		this.upVotes = upVotes;
	}
	public int getDownVotes() {
		return downVotes;
	}
	public void setDownVotes(int downVotes) {
		this.downVotes = downVotes;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public ReviewCategory getCategory() {
		return category;
	}
	public void setCategory(ReviewCategory category) {
		this.category = category;
	}
	public Date getDateTimeAdded() {
		return dateTimeAdded;
	}
	public void setDateTimeAdded(Date dateTimeAdded) {
		this.dateTimeAdded = dateTimeAdded;
	}
}
