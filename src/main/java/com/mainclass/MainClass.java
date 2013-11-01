package mainclass;
import parseXml.XmlParser;

public class mainClass {

	public static void main(String[] args) {
		XmlParser parser = new XmlParser("Location.xml");
		parser.parseAndPersistEntity();
		parser.setXmlFileName("Cuisine.xml");
		parser.parseAndPersistEntity();
		parser.setXmlFileName("User.xml");
		parser.parseAndPersistEntity();
		parser.setXmlFileName("Restaurant.xml");
		parser.parseAndPersistEntity();
		parser.setXmlFileName("Manager.xml");
		parser.parseAndPersistEntity();
		parser.setXmlFileName("AddRestaurantRequest.xml");
		parser.parseAndPersistEntity();	
		parser.setXmlFileName("Review.xml");
		parser.parseAndPersistEntity();
		parser.setXmlFileName("Recommendation.xml");
		parser.parseAndPersistEntity();
		/*String[] parts=(System.getProperty("java.class.path")).split(";");
		
		for(String s:parts)
		{
			System.out.println(s);
		}*/
		
	}

}
