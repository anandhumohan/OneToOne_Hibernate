package com.anandhu.onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CAPITAL")
public class Capital {
	@Id
	@Column(name = "Capital_name")
	private String capitalName;

	@Column(name = "Capital_Population")
	private long capitalPopulation;

	public String getCapitalName() {
		return capitalName;
	}

	public void setCapitalName(String capitalName) {
		this.capitalName = capitalName;
	}

	public long getCapitalPopulation() {
		return capitalPopulation;
	}

	public void setCapitalPopulation(long capitalPopulation) {
		this.capitalPopulation = capitalPopulation;
	}
}
