package com.tns.polymorphism;

public class point {
   
private float x,y;
   public point() {
	
		x=0.0f;
		y=0.0f;
	   }
   public point(float x) {
	   this.x=x;
	  
   }
public point(float x, float y) {
	this.x = x;
	this.y = y;
	
}

@Override
public String toString() {
	return "point [x=" + x + ", y=" + y + "]";
}

}
