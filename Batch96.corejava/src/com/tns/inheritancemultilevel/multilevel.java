package com.tns.inheritancemultilevel;

public class multilevel extends states{

	public static void main(String[] args) {
		states ob=new states();
		ob.setContinentName("Asia");
		ob.setNoOfCountries(49);
	    ob.setCountryName("India");
		ob.setNoOfStates(28);
		ob.setCountryCapital("new Delhi");
		ob.setStateName("karnataka");
		ob.setStateCapital("Bengaluru");
		ob.setNoOfDistricts(31);
		System.out.println(ob);
	}


}
	


