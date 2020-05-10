package com.corona.model;

public class LocationStats {
	
	private String state;
	private String country;
    private int latestCases;
    private int previousDayCases;
    
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getLatestCases() {
		return latestCases;
	}
	public void setLatestCases(int latestCases) {
		this.latestCases = latestCases;
	}
	public int getPreviousDayCases() {
		return previousDayCases;
	}
	public void setPreviousDayCases(int previousDayCases) {
		this.previousDayCases = previousDayCases;
	}
	@Override
	public String toString() {
		return "LocationStats [state=" + state + ", country=" + country + ", latestCases=" + latestCases
				+ ", previousDayCases=" + previousDayCases + "]";
	}
    
  

}
