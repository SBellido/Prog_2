package tp3_Persona;

import java.time.LocalDate;

public class Person {
	private String name;
	private String lastname;
	private int yearOld;
	private LocalDate birth;
	private String dni;
	private String sex;
	private float weight;
	private float height;
	
	public Person(String dni) {
		this.dni = dni;
		this.birth = LocalDate.of(2000, 1, 1);
		this.sex = "Femenino";
		this.name = "N";
		this.lastname = "N";
		this.height = 1;
		this.weight = 1;	
	}
	
	public Person(String dni, String name, String lastName) {
		this.dni = dni;
		this.birth = LocalDate.of(2000, 1, 1);
		this.sex = "Femenino";
		this.name = name;
		this.lastname = lastName;
		this.height = 1;
		this.weight = 1;	
	}
	
	public Person(String dni, String name, String lastName, LocalDate birth) {
		this.dni = dni;
		this.birth = birth;
		this.sex = "Femenino";
		this.name = name;
		this.lastname = lastName;
		this.height = 1;
		this.weight = 1;	
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYearOld() {
		return yearOld;
	}
	public void setYearOld(int yearOld) {
		this.yearOld = yearOld;
	}
	public LocalDate getBirth() {
		return birth;
	}
	public void setBirth(LocalDate birth) {
		this.birth = birth;
	}
	public String getDni() {
		return dni;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
}

