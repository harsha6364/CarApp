package com.dcl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class Car {
	
//	@Autowired
//	@Qualifier("petrol")
	private Engine eng;
	
	
	public Car() {
		System.out.println("0 parameterized const of car");
	}
	
//	@Autowired
	public Car(Engine eng) {
		this.eng = eng;
		System.out.println(" parameterized const of car");
	}
	
	@Autowired
//	@Qualifier("eng")
	public void setEng(Engine eng) {
		this.eng =eng;
		System.out.println("Setter method() got called");
	}
	
	void revv() {
		eng.start();
		System.out.println("Car is started and moving");
	}
}
