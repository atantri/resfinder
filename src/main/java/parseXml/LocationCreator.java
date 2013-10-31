package parseXml;

import domain.Location;
import orm.LocationMapper;

public class LocationCreator implements IEntityCreator {
	Location location;
	LocationMapper mapper;
	
	public LocationCreator(){
		location = new Location();
		mapper =  new LocationMapper();
	}
	
	@Override
	public void setValue(String name, String value) {
		// TODO Auto-generated method stub
		if(name.equalsIgnoreCase("Id")){
			location.setId(Integer.parseInt(value));
			System.out.println("Id:" + value);
		}
		
		else if(name.equalsIgnoreCase("Name")){
			location.setName(value);
			System.out.println("Name:" + value);
		}
	}

	@Override
	public boolean saveEntity() {
		mapper.insert(location);
		return false;
	}

}
