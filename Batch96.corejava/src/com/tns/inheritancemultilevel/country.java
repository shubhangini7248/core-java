package com.tns.inheritancemultilevel;

public class country extends continent {
   private String CountryName;
   private String CountryCapital;
   private int NoOfStates;
public country() {
	super();
}

public country(String continentName, int noOfCountries ,String countryName, String countryCapital, int noOfstates) {
	super(continentName, noOfCountries );
	CountryName=countryName;
	CountryCapital=countryCapital;
	NoOfStates=noOfstates;
}


public String getCountryName() {
	return CountryName;
}
public void setCountryName(String countryName) {
	CountryName = countryName;
}
public String getCountryCapital() {
	return CountryCapital;
}
public void setCountryCapital(String countryCapital) {
	CountryCapital = countryCapital;
}
public int getNoOfStates() {
	return NoOfStates;
}
public void setNoOfStates(int noOfStates) {
	NoOfStates = noOfStates;
}

@Override
public String toString() {
	return "country [CountryName=" + CountryName + ", CountryCapital=" + CountryCapital + ", NoOfStates=" + NoOfStates
			+ ", getContinentName()=" + getContinentName() + ", getNoOfCountries()=" + getNoOfCountries()
			+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
}





}


   

