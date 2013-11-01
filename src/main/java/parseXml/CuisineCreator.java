package parseXml;

import domain.Cuisine;
import orm.CuisineMapper;

public class CuisineCreator implements IEntityCreator {
	Cuisine cuisine;
	CuisineMapper mapper;
	
	public CuisineCreator(){
		cuisine = new Cuisine();
		mapper =  new CuisineMapper();
	}
	@Override
	public void setValue(String name, String value) {
		// TODO Auto-generated method stub
		if(name.equalsIgnoreCase("Id")){
			cuisine.setId(Integer.parseInt(value));
			System.out.println("Id:" + value);
		}
		
		else if(name.equalsIgnoreCase("Description")){
			cuisine.setDescription(value);
			System.out.println("Description:" + value);
		}
		
		else if(name.equalsIgnoreCase("Name")){
			cuisine.setName(value);
			System.out.println("Name:" + value);
		}
	}

	@Override
	public boolean saveEntity() {
		mapper.insert(cuisine);
		return false;
	}

}
