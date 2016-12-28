package org.project.model;

public class City {
	
	private Integer id;
	
	private String  cityID;
	
	private String city;
	
	private String father;

	public City() {
		super();
	}

	public City(String cityID, String city, String father) {
		super();
		this.cityID = cityID;
		this.city = city;
		this.father = father;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCityID() {
		return cityID;
	}

	public void setCityID(String cityID) {
		this.cityID = cityID;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getFather() {
		return father;
	}

	public void setFather(String father) {
		this.father = father;
	}

	@Override
	public String toString() {
		return "City [id=" + id + ", cityID=" + cityID + ", city=" + city + ", father=" + father + "]";
	}
	
	
	
	
	

}
