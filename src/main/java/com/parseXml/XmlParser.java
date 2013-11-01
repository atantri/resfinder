package parseXml;

import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import domain.User;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class XmlParser extends DefaultHandler{

	private IEntityCreator entityCreator;
	private StringBuilder nodeValue;
	private String xmlFolderName;
	private String xmlFileName;
	private Properties prop;
	
	public void setXmlFileName(String xmlFileName) {
		this.xmlFileName = xmlFolderName+xmlFileName;
	}

	public XmlParser(String xmlFileName){
		try {
			prop = new Properties();
			prop.load(new FileInputStream(new File(System.getProperty("user.home")+"/workspace/resfinder/src/config.properties")));
			xmlFolderName = System.getProperty("user.home")+"/"+prop.getProperty("xmlFolderLocation");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.xmlFileName = xmlFolderName+xmlFileName;
		entityCreator = null;
	}
	
	public void parseAndPersistEntity(){
		SAXParserFactory factory = SAXParserFactory.newInstance();
		factory.setValidating(true);
		
		try{
			File xmlFile = new File(xmlFileName);
			SAXParser parser = factory.newSAXParser();
			System.out.println("a="+xmlFileName);
			parser.parse(xmlFile, this);
			
		}
		catch(SAXException saxexception){
			saxexception.printStackTrace();
		}
		catch(IOException ioexception){
			
			ioexception.printStackTrace();
		}
		catch(ParserConfigurationException parserexception){
			parserexception.printStackTrace();
		}
	}
	
	public void characters(char[] ch, int start, int length){
		nodeValue.append(ch, start, length);
	}
	
	
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException{
		nodeValue = new StringBuilder();
		if(qName.equalsIgnoreCase("AddRestaurantRequest")){
			entityCreator = new AddRestaurantRequestCreator();
			System.out.println("======== Start Element Request =======");
		}
		else if(qName.equalsIgnoreCase("Cuisine")){
			entityCreator = new CuisineCreator();
			System.out.println("======== Start Element Request =======");
		}
		else if(qName.equalsIgnoreCase("Location")){
			entityCreator = new LocationCreator();
			System.out.println("======== Start Element Request =======");
		}
		else if(qName.equalsIgnoreCase("Manager")){
			entityCreator = new ManagerCreator();
			System.out.println("======== Start Element Request =======");
		}
		else if(qName.equalsIgnoreCase("Recommendation")){
			entityCreator = new RecommendationCreator();
			System.out.println("======== Start Element Request =======");
		}
		else if(qName.equalsIgnoreCase("Restaurant")){
			entityCreator = new RestaurantCreator();
			System.out.println("======== Start Element Request =======");
		}
		else if(qName.equalsIgnoreCase("RestaurantCuisineMap")){
			entityCreator = new RestaurantCuisineMapCreator();
			System.out.println("======== Start Element Request =======");
		}
		else if(qName.equalsIgnoreCase("Review")){
			entityCreator = new ReviewCreator();
			System.out.println("======== Start Element Request =======");
		}
		else if(qName.equalsIgnoreCase("User")){
			entityCreator = new UserCreator();
			System.out.println("======== Start Element Request =======");
		}
		else if(qName.equalsIgnoreCase("UserCuisineMap")){
			entityCreator = new UserCuisineMapCreator();
			System.out.println("======== Start Element Request =======");
		}
		else if(qName.equalsIgnoreCase("UserLocationMap")){
			entityCreator = new UserLocationMapCreator();
			System.out.println("======== Start Element Request =======");
		}
	}
	
	public void endElement(String uri, String localName, String qName) throws SAXException, NumberFormatException{
		if(qName.equalsIgnoreCase("AddRestaurantRequest") ||
				qName.equalsIgnoreCase("Cuisine") ||
				qName.equalsIgnoreCase("Location") ||
				qName.equalsIgnoreCase("Manager") ||
				qName.equalsIgnoreCase("Recommendation") ||
				qName.equalsIgnoreCase("Restaurant") ||
				qName.equalsIgnoreCase("RestaurantCuisineMap") ||
				qName.equalsIgnoreCase("Review") ||
				qName.equalsIgnoreCase("User") ||
				qName.equalsIgnoreCase("UserCuisineMap") ||
				qName.equalsIgnoreCase("UserLocationMap")){
			System.out.println("======== End Element Request =======");
			try{
				entityCreator.saveEntity();
			}
			catch(Exception exception){
				exception.printStackTrace();
			}
		}
		else{
			entityCreator.setValue(qName, nodeValue.toString());
		}
			
	}
}