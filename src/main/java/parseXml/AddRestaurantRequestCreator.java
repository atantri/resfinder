package parseXml;

import domain.AddRestaurantRequest;

import domain.Manager;
import domain.RequestStatus;
import orm.*;

public class AddRestaurantRequestCreator implements IEntityCreator {
	AddRestaurantRequest request;
	AddRestaurantRequestMapper mapper;
	
	public AddRestaurantRequestCreator(){
		request = new AddRestaurantRequest();
		mapper =  new AddRestaurantRequestMapper();
	}
	@Override
	public void setValue(String name, String value) {
		if(name.equalsIgnoreCase("Id")){
			request.setId(Integer.parseInt(value));
			System.out.println("RequestId:" + value);
		}
		
		else if(name.equalsIgnoreCase("ManagerId")){
			Manager manager = new Manager();
			manager.setId(value);
			request.setManager(manager);
			System.out.println("ManagerId:" + value);
		}
		
		else if(name.equalsIgnoreCase("RestaurantName")){
			request.setRestaurantName(value);
			System.out.println("RestaurantName:" + value);
		}
		
		else if(name.equalsIgnoreCase("CuisineString")){
			request.setCuisine(value);
			System.out.println("Cuisine:" + value);
		}
		else if(name.equalsIgnoreCase("Address")){
			request.setAddress(value);
			System.out.println("Location:" + value);
		}
		else if(name.equalsIgnoreCase("Status")){
			request.setStatus(RequestStatus.valueOf(value));
			System.out.println("Status:" + value);
		}

	}

	@Override
	public boolean saveEntity() {
		mapper.insert(request);
		return false;
	}

}
