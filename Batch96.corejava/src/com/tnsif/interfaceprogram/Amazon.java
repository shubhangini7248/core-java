//program to demonstrate interface
package com.tnsif.interfaceprogram;

public interface Amazon {
	
      void welcome();//abstract
      void thankyou();//abstract
      default void serviceCharge() {
    	  int amt=100;
    	  System.out.println("the service charge is"+amt);
      }
     static void aboutUs() {
    	 System.out.println("its a ecommerce website");
     }
}