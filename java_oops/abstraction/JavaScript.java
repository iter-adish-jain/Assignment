package edu.jecrc.sdt.java_oops.abstraction;

public class JavaScript 
extends ProgrammingLanguage
implements FrontEnd, BackEnd{

	@Override
	public void backEndLayer() {
		System.out.println("Compatible with DB");
		
	}

	@Override
	public void frontEndLayer() {
		System.out.println("Compatible with HTML and CSS");
		
	}

	@Override
	public void feature() {
		System.out.println("Object Oriented");
		
	}

}
