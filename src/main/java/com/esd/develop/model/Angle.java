package com.esd.develop.model;

import java.util.Objects;




//is a relationship
public class Angle extends Object {
	
	
    private Long id;
	
	private String email;

   //has a interestArea obj ..  Compositon /Aggregation  
	private InterestArea interestArea;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public InterestArea getInterestArea() {
		return interestArea;
	}

	public void setInterestArea(InterestArea interestArea) {
		this.interestArea = interestArea;
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, id, interestArea);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Angle other = (Angle) obj;
		return Objects.equals(email, other.email) && Objects.equals(id, other.id)
				&& Objects.equals(interestArea, other.interestArea);
	}

	@Override
	public String toString() {
		return "Angle [id=" + id + ", email=" + email + ", interestArea=" + interestArea + "]";
	}
 
}
