//program to demonstrate constructor
	package com.tns.constructor;

	public class Customer {
	      private int id;
	      private String name;
	  //default Constructor    
		public Customer() {
			super();
			System.out.println("----default constructor---");
		}

		public Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}



		@Override
		public String toString() {
			return "Costomer [id=" + id + ", name=" + name + "]";
		}
	}


