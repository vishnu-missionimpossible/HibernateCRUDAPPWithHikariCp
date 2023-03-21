package in.ineuron.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//DTO->Data Transfer Object
@Entity
@Table(name = "HibernateCRUDAppWithHikariCp")
public class Student{
	

   private String name;
   private String email;
   private String city;
   private String country;
   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id;	
 
static {
	System.out.println("Student.class file is loading...");
}   
   
public Student() {
	   System.out.println("Student object created...");
}

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}

@Override
public String toString() {
	return "Student [name=" + name + ", email=" + email + ", city=" + city + ", country=" + country + ", id=" + id
			+ "]";
}
	
	
}
