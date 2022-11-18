package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testaddstrings {

	@Test
	public void test() {
		jUnitFunctions junit = new jUnitFunctions();
		String result = junit.addString("lab10","atishi");
		assertEquals("lab10atishi",result);
	}

}