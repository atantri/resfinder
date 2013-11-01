package parseXml;

import java.text.ParseException;

import java.text.SimpleDateFormat;

import domain.Restaurant;
import domain.Review;
import domain.ReviewCategory;
import domain.User;
import orm.ReviewMapper;

public class ReviewCreator implements IEntityCreator {
	Review review;
	ReviewMapper mapper;
	
	public ReviewCreator(){
		review = new Review();
		mapper =  new ReviewMapper();
	}
	
	@Override
	public void setValue(String name, String value) {
		if(name.equalsIgnoreCase("Id")){
			review.setId(Integer.parseInt(value));
			System.out.println("Id:" + value);
		}
		else if(name.equalsIgnoreCase("RestaurantId")){
			Restaurant restaurant = new Restaurant();
			restaurant.setId(Integer.parseInt(value));
			review.setRestaurant(restaurant);
			System.out.println("RestaurantId:" + value);
		}
		else if(name.equalsIgnoreCase("UserId")){
			User user = new User();
			user.setId(value);
			review.setUser(user);
			System.out.println("UserId:" + value);
		}
		else if(name.equalsIgnoreCase("DateTimeAdded")){
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
			try {
				review.setDateTimeAdded(df.parse(value));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("DateTimeAdded:" + value);
		}
		else if(name.equalsIgnoreCase("Content")){
			review.setContent(value);
			System.out.println("Content:" + value);
		}
		else if(name.equalsIgnoreCase("Upvotes")){
			review.setUpVotes(Integer.parseInt(value));
			System.out.println("Upvotes:" + value);
		}
		else if(name.equalsIgnoreCase("Downvotes")){
			review.setDownVotes(Integer.parseInt(value));
			System.out.println("Downvotes:" + value);
		}
		else if(name.equalsIgnoreCase("Category")){
			review.setCategory(ReviewCategory.valueOf(value.toUpperCase()));
			System.out.println("Category:" + value);
		}
	}

	@Override
	public boolean saveEntity() {
		mapper.insert(review);
		return false;
	}

}
