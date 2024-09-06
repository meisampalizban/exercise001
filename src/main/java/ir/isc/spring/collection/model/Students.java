package ir.isc.spring.collection.model;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Students implements Comparable<Students> {
	@Id
	@GeneratedValue
	private int id;
	@Column(nullable = false, length = 50)
	private String firstName;
	@Column(nullable = false, length = 50)
	private String lastName;
	private byte age;
	private float grade;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id", referencedColumnName = "id")
	private Address address;
	
	public Students(){
	
	}
	
	public Students(String firstName,String lastName,int age,float grade,Address address){
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = (byte) age;
		this.grade = grade;
		this.address = address;
	}
	
	public float getGrade(){
		return grade;
	}
	
	public void setGrade(float grade){
		this.grade = grade;
	}
	
	public int getId(){
		return id;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	
	public byte getAge(){
		return age;
	}
	
	public void setAge(int age){
		this.age = (byte) age;
	}
	
	public Address getAddress(){
		return address;
	}
	
	public void setAddress(Address address){
		this.address = address;
	}
	
	
	@Override
	public int compareTo(Students o){
		if(this.age == o.age)
			return 0;
		else if(this.age > o.age)
			return 1;
		else
			return -1;
	}
	
	@Override
	public boolean equals(Object o){
		if(o == this)
			return true;
		Students s = (Students) o;
		return s.id == this.id;
	}
	
}
