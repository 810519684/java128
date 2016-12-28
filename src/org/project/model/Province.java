package org.project.model;

public class Province {
	
private Integer id;

private String provinceID;

private String province;

public Province() {
	super();
}

public Province(String provinceID, String province) {
	super();
	this.provinceID = provinceID;
	this.province = province;
}

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getProvinceID() {
	return provinceID;
}

public void setProvinceID(String provinceID) {
	this.provinceID = provinceID;
}

public String getProvince() {
	return province;
}

public void setProvince(String province) {
	this.province = province;
}

@Override
public String toString() {
	return "province [id=" + id + ", provinceID=" + provinceID + ", province=" + province + "]";
}






	

}
