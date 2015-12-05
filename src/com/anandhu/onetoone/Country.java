package com.anandhu.onetoone;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

//import org.hibernate.annotations.Table;

@Entity
@Table(name = "COUNTRY")
public class Country {
	@Id
	@Column(name = "Country_Name")
	private String countryName;

	@Column(name = "Population")
	private long population;

	@OneToOne
	@JoinColumn(name = "Capital_Name")
	Capital capital;

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

	public long getPopulation() {
		return population;
	}

	public void setCapital(Capital capital) {
		this.capital = capital;
	}

	public Capital getCapital() {
		return capital;
	}

}
