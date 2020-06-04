package com.dao.entity;

public class MoviesEntity {

	private String password;
	private String emailAddress;
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	private int movies_id;
	private String name;
	private int year;
	private int idmb;
	private String Category;
	public int getMovies_id() {
		return movies_id;
	}
	public void setMovies_id(int movies_id) {
		this.movies_id = movies_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getIdmb() {
		return idmb;
	}
	public void setIdmb(int idmb) {
		this.idmb = idmb;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public MoviesEntity(int movies_id, String name, int year, int idmb, String category) {
		super();
		this.movies_id = movies_id;
		this.name = name;
		this.year = year;
		this.idmb = idmb;
		Category = category;
	}
	@Override
	public String toString() {
		return "MoviesEntity [password=" + password + ", emailAddress=" + emailAddress + ", movies_id=" + movies_id
				+ ", name=" + name + ", year=" + year + ", idmb=" + idmb + ", Category=" + Category + "]";
	}
	

	
}
