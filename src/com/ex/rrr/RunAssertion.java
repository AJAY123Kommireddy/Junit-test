package com.ex.rrr;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class RunAssertion {

	public static void main(String[] args) {
		
	Result	res = JUnitCore.runClasses(AssertMethodsEx.class);
	     
	   for( Failure failures:res.getFailures()) {
		   
		   System.out.println(failures.toString());
	   }
	   System.out.println("Result :"+res.wasSuccessful());
	      
	}
	
	
}
