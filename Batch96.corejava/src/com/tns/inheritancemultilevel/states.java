package com.tns.inheritancemultilevel;

public class states extends country {
	private String StateName;
	private int NoOfDistricts;
	private String StateCapital;
	public states() {
		super();
	}
	
	public states(String continentName, int noOfCountries, String countryName, String countryCapital, int noOfstates,String stateName,int noOfDistricts,String stateCapital) {
		super(continentName, noOfCountries, countryName, countryCapital, noOfstates);
		StateName=stateName;
		NoOfDistricts=noOfDistricts;
		StateCapital=stateCapital;
	}

	public String getStateName() {
		return StateName;
	}
	public void setStateName(String stateName) {
		StateName = stateName;
	}
	public int getNoOfDistricts() {
		return NoOfDistricts;
	}
	public void setNoOfDistricts(int noOfDistricts) {
		NoOfDistricts = noOfDistricts;
	}
	public String getStateCapital() {
		return StateCapital;
	}
	public void setStateCapital(String stateCapital) {
		StateCapital = stateCapital;
	}

	@Override
	public String toString() {
		return "states [StateName=" + StateName + ", NoOfDistricts=" + NoOfDistricts + ", StateCapital=" + StateCapital
				+ ", getCountryName()=" + getCountryName() + ", getCountryCapital()=" + getCountryCapital()
				+ ", getNoOfStates()=" + getNoOfStates() + ", toString()=" + super.toString() + ", getContinentName()="
				+ getContinentName() + ", getNoOfCountries()=" + getNoOfCountries() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
	
	}
	
		
	
	
	


