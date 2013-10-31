package domain;
import javax.persistence.*;
@Entity
public class Location  {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="LOC_SEQ")
	int id;
	String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
