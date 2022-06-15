package com.ex;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class RunJunit {

	public static void main(String[] args) {
		
		
		Result res =JUnitCore.runClasses(JunitClass.class);
		
		for(Failure failure : res.getFailures()) {
			
			System.out.println(failure.toString());
			
		}
		
		System.out.println("Result :"+res.wasSuccessful());
	}
	
	
}
