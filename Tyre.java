package com.tcs.AssignmentJavaConfig;



import org.springframework.stereotype.Component;

@Component
public class Tyre {
	

	public Tyre() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String tyre;

	public Tyre(String tyre) {
		super();
		this.tyre = tyre;
	}

	public String getTyrebrand() {
		return tyre;
	}

	public void setTyrebrand(String tyrebrand) {
		this.tyre = tyrebrand;
	}

	@Override
	public String toString() {
		return "Tyre [tyrebrand=" + tyre + "]";
	}
	
	}