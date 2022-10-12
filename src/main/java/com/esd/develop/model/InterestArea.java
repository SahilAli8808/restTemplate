package com.esd.develop.model;

import java.util.Objects;



public class InterestArea {
	
	
	private Long id;
	
	private String area;
	private String detail;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

		
	

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	@Override
	public int hashCode() {
		return Objects.hash(area, detail, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InterestArea other = (InterestArea) obj;
		return Objects.equals(area, other.area) && Objects.equals(detail, other.detail) && Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "InterestArea [id=" + id + ", area=" + area + ", detail=" + detail + "]";
	}

	

	

	
}
