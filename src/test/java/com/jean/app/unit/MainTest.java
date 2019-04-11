package com.jean.app.unit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.jean.app.Main;

public class MainTest {
	
	Main main; 
	
	@Before
	public void init() {
		main = new Main();
	}

	@Test
	public void isTrueTest() {
		assertTrue(main.isTrue());
	}

}
