package com.cg.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class hoteldetails {
@Id	
private Integer id;
private String name;
private String rating;
private Integer rate;
private Integer availablerooms;
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
public String getRating() {
	return rating;
}
public void setRating(String rating) {
	this.rating = rating;
}
public Integer getRate() {
	return rate;
}
public void setRate(Integer rate) {
	this.rate = rate;
}
public Integer getNumber() {
	return availablerooms;
}
public void setNumber(Integer availablerooms) {
	this.availablerooms = availablerooms;
}

}
