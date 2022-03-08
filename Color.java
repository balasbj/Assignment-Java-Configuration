package com.tcs.AssignmentJavaConfig;


import org.springframework.stereotype.Component;

@Component
public class Color {
private String color;

public Color() {
	super();
	// TODO Auto-generated constructor stub
}

public Color(String color) {
	super();
	this.color = color;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

@Override
public String toString() {
	return "Color [color=" + color + "]";
}


}