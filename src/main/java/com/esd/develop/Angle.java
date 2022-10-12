package com.esd.develop;

import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GeneratorType;

@Entity (name = "ESD_ANGLE")
public class Angle {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;	 //primary key
	private String email; //normal field
	
	
	private String fullName;
	private String address;
	private String contact;

	private String remark;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	
    @JoinColumn(name = "interest_id", referencedColumnName = "id")
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

	
	
	
	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}


	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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
		return "Angle [id=" + id + ", email=" + email + ", fullName=" + fullName + ", address=" + address + ", contact="
				+ contact + ", remark=" + remark + ", interestArea=" + interestArea + "]";
	}
	
	
	
	
 
}
