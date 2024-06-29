package com.tns.inheritancemultilevel;

public class continent {
  private String ContinentName;
  private int NoOfCountries;
 
public continent() {
	super();
}
public continent(String continentName, int noOfCountries) {
	super();
	ContinentName = continentName;
	NoOfCountries = noOfCountries;
	
}
public String getContinentName() {
	return ContinentName;
}
public void setContinentName(String continentName) {
	ContinentName = continentName;
}
public int getNoOfCountries() {
	return NoOfCountries;
}
public void setNoOfCountries(int noOfCountries) {
	NoOfCountries = noOfCountries;
}



@Override
public String toString() {
	return "continent [ContinentName=" + ContinentName + ", NoOfCountries=" + NoOfCountries + "]";
			
}
  
}
