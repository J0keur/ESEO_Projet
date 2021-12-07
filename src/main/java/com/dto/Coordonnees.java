package com.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Coordonnees {
	
	@JsonProperty("longitude")
	private String longitude;
	@JsonProperty("latitude")
	private String latitude;

	public Coordonnees(String latitude, String longitude) {
		super();
		this.longitude = longitude;
		this.latitude = latitude;
	}
	
	@JsonProperty("longitude")
	public String getLongitude() {
		return longitude;
	}

	@JsonProperty("longitude")
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	@JsonProperty("latitude")
	public String getLatitude() {
		return latitude;
	}

	@JsonProperty("latitude")
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

}