package parseXml;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import domain.Recommendation;
import domain.Restaurant;
import domain.User;
import orm.RecommendationMapper;

public class RecommendationCreator implements IEntityCreator {
	Recommendation recommendation;
	RecommendationMapper mapper;
	
	public RecommendationCreator(){
		recommendation = new Recommendation();
		mapper =  new RecommendationMapper();
	}
	
	@Override
	public void setValue(String name, String value) {
		if(name.equalsIgnoreCase("Id")){
			recommendation.setId(Integer.parseInt(value));
			System.out.println("Id:" + value);
		}
		else if(name.equalsIgnoreCase("RestaurantId")){
			Restaurant restaurant = new Restaurant();
			restaurant.setId(Integer.parseInt(value));
			recommendation.setRestaurant(restaurant);
			System.out.println("RestaurantId:" + value);
		}
		else if(name.equalsIgnoreCase("UserId")){
			User user = new User();
			user.setId(value);
			recommendation.setUser(user);
			System.out.println("UserId:" + value);
		}
		else if(name.equalsIgnoreCase("DateAdded")){
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
			try {
				recommendation.setDateAdded(df.parse(value));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("DateAdded:" + value);
		}
	}

	@Override
	public boolean saveEntity() {
		mapper.insert(recommendation);
		return false;
	}

}
