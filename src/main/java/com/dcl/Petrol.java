package com.dcl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("petrol")
//@Primary
public class Petrol implements Engine {

	@Override
	public void start() {
		System.out.println("Petrol engine started");

	}

}
