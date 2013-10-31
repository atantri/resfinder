package parseXml;

import java.text.ParseException;

import java.text.SimpleDateFormat;
import domain.User;
import orm.UserMapper;

public class UserCreator implements IEntityCreator {
	User user;
	UserMapper mapper;
	
	public UserCreator(){
		user = new User();
		mapper =  new UserMapper();
	}
	
	@Override
	public void setValue(String name, String value) {
		if(name.equalsIgnoreCase("Id")){
			user.setId(value);
			System.out.println("Id:" + value);
		}
		
		else if(name.equalsIgnoreCase("Name")){
			user.setName(value);
			System.out.println("Name:" + value);
		}
		
		else if(name.equalsIgnoreCase("EmailId")){
			user.setEmailId(value);
			System.out.println("EmailId:" + value);
		}
		
		else if(name.equalsIgnoreCase("Password")){
			user.setPassword(value);
			System.out.println("Password:" + value);
		}
		
		else if(name.equalsIgnoreCase("Rank")){
			user.setRank(Integer.parseInt(value));
			System.out.println("Rank:" + value);
		}
		else if(name.equalsIgnoreCase("LastLoginTime")){
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
			try {
				user.setLastLoginTime(df.parse(value));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("LastLoginTime:" + value);
		}
		else if(name.equalsIgnoreCase("LastLogoutTime")){
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
			try {
				user.setLastLogoutTime(df.parse(value));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("LastLogoutTime:" + value);
		}
	}

	@Override
	public boolean saveEntity() {
		mapper.insert(user);
		return false;
	}

}
