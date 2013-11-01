package domain;

import java.util.*;
import javax.persistence.*;

public class User extends Person  {
		
		int rank;
		Date lastLoginTime;
		Date lastLogoutTime;
		@OneToMany
		List<Location> preferredLocations;
		@OneToMany
		List<Cuisine> preferredCuisines;
		@OneToMany(cascade=CascadeType.ALL)
		List<Review> reviews;
		@OneToMany(cascade=CascadeType.ALL)
		List<Recommendation> recommendations;
		
		public int getRank() {
			return rank;
		}
		public void setRank(int rank) {
			this.rank = rank;
		}
		public Date getLastLoginTime() {
			return lastLoginTime;
		}
		public void setLastLoginTime(Date lastLoginTime) {
			this.lastLoginTime = lastLoginTime;
		}
		public Date getLastLogoutTime() {
			return lastLogoutTime;
		}
		public void setLastLogoutTime(Date lastLogoutTime) {
			this.lastLogoutTime = lastLogoutTime;
		}
		public List<Location> getPreferredLocations() {
			return preferredLocations;
		}
		public void setPreferredLocations(List<Location> preferredLocations) {
			this.preferredLocations = preferredLocations;
		}
		public List<Cuisine> getPreferredCuisines() {
			return preferredCuisines;
		}
		public void setPreferredCuisines(List<Cuisine> preferredCuisines) {
			this.preferredCuisines = preferredCuisines;
		}
		public List<Review> getReviews() {
			return reviews;
		}
		public void setReviews(List<Review> reviews) {
			this.reviews = reviews;
		}
		public List<Recommendation> getRecommendations() {
			return recommendations;
		}
		public void setRecommendations(List<Recommendation> recommendations) {
			this.recommendations = recommendations;
		}
}
