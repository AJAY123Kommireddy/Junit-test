package com.ex.rrr;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.Test;

public class AssertMethodsEx {

	//Assert methos :-> 1.assertEquals(),2.assertTrue(),3.assertFalse(),4.assertNotNull(),
	//5.assertNull(),6.assertSame(),7.assertNotSame(),8.assertArrayEquals().
	
	String str1 = new String("Ajay");
	String str2 = new String("Ajay");
	int val1 =2;
	int val2 =3;
	String str3 = null;
	String str4 ="Kumar";
	String str5 ="Kumar";
	String str6 ="Ajay";
	String str7[]= {"one","two","three"};
	String str8[]= {"one","two","three"};
	
	
	@Test
	public void assertMeth() {
	//checking for equals
	assertEquals(str1,str2);
	//checking for true condition
	assertTrue(val1<val2);
	//checking for false condition
	assertFalse(val1>val2);
	//checking for obj is not null
	assertNotNull(str5);
	//checking for obj is null
	assertNull(str3);
	//checking for two references are pointing same objs
	assertSame(str4, str5);
	//checking for two reference are not pointing same obj
	assertNotSame(str2, str6);
	//checking for two arrays are equals
	assertArrayEquals(str7, str8);
	}
	
	
	
	
	
	
	
	
}
