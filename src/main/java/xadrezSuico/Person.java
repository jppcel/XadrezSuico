package xadrezSuico;

import java.util.Date;

public class Person {
	
	//Data about the Person
	//Person's ID on Database
	private int id;
	//Name
	private String firstName;
	private String lastName;
	//Sex
	private Sex sex;
	// Date of Birth
	private Date birth;
	// Federation of Person
	private Federation fed;
	// Player's Location
	private City city;
	
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Sex getSex() {
		return sex;
	}
	public void setSex(Sex sex) {
		this.sex = sex;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public Federation getFederation(){
		return this.fed;
	}
	public void setFederation(Federation fed){
		this.fed = fed;
	}
}
