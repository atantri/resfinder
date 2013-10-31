package parseXml;

import domain.Manager;
import domain.Restaurant;
import orm.ManagerMapper;

public class ManagerCreator implements IEntityCreator {
	Manager manager;
	ManagerMapper mapper;
	
	public ManagerCreator(){
		manager = new Manager();
		mapper =  new ManagerMapper();
	}
	
	@Override
	public void setValue(String name, String value) {
		if(name.equalsIgnoreCase("Id")){
			manager.setId(value);
			System.out.println("Id:" + value);
		}
		else if(name.equalsIgnoreCase("RestaurantId")){
			Restaurant restaurant = new Restaurant();
			restaurant.setId(Integer.parseInt(value));
			manager.setRestaurant(restaurant);
			System.out.println("RestaurantId:" + value);
		}
		else if(name.equalsIgnoreCase("Phone")){
			manager.setPhone(value);
			System.out.println("Phone:" + value);
		}
		else if(name.equalsIgnoreCase("Address")){
			manager.setAddress(value);
			System.out.println("Address:" + value);
		}
	}

	@Override
	public boolean saveEntity() {
		mapper.insert(manager);
		return false;
	}

}
