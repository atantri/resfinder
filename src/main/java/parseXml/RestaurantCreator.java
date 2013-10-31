package parseXml;

import domain.Location;
import domain.Restaurant;
import orm.RestaurantMapper;

public class RestaurantCreator implements IEntityCreator {
	Restaurant restaurant;
	RestaurantMapper mapper;
	
	public RestaurantCreator(){
		restaurant = new Restaurant();
		mapper =  new RestaurantMapper();
	}
	
	@Override
	public void setValue(String name, String value) {
		if(name.equalsIgnoreCase("Id")){
			restaurant.setId(Integer.parseInt(value));
			System.out.println("Id:" + value);
		}
		else if(name.equalsIgnoreCase("Name")){
			restaurant.setName(value);
			System.out.println("Name:" + value);
		}
		else if(name.equalsIgnoreCase("Rating")){
			restaurant.setRating(Integer.parseInt(value));
			System.out.println("Rating:" + value);
		}
		else if(name.equalsIgnoreCase("Address")){
			restaurant.setAddress(value);
			System.out.println("Address:" + value);
		}
		else if(name.equalsIgnoreCase("LocationId")){
			Location location = new Location();
			location.setId(Integer.parseInt(value));
			restaurant.setLocation(location);
			System.out.println("LocationId:" + value);
		}
	}

	@Override
	public boolean saveEntity() {
		mapper.insert(restaurant);
		return false;
	}

}
