package domain;
import javax.persistence.*;
@Entity
public class Cuisine  {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="CUIS_SEQ")
	int id;
	String description;
	String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
