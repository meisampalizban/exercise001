package ir.isc.spring.collection.model;

import jakarta.persistence.*;

@Entity
@Table(name = "address")
public class Address {
	
	@Id
	@GeneratedValue
	private int id;
	@Column(length = 60)
	private String country;
	@Column(length = 60)
	private String city;
	@Column(length = 60)
	private String street;
	@OneToOne(mappedBy = "address")
	private Students student;
	
	public Address(){
	
	}
	
	public Address(String country,String city,String street){
		this.country = country;
		this.city = city;
		this.street = street;
	}
	
	public int getId(){
		return id;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public Students getStudent(){
		return student;
	}
	
	public void setStudent(Students student){
		this.student = student;
	}
	
	public String getCity(){
		return city;
	}
	
	public void setCity(String city){
		this.city = city;
	}
	
	public String getCountry(){
		return country;
	}
	
	public void setCountry(String country){
		this.country = country;
	}
	
	public String getStreet(){
		return street;
	}
	
	public void setStreet(String street){
		this.street = street;
	}
}
