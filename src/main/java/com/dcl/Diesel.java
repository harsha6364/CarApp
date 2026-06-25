package com.dcl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("eng")
//@Primary
public class Diesel implements Engine {

	@Override
	public void start() {
		System.out.println("Diesel Engine started");
		
	}

}
