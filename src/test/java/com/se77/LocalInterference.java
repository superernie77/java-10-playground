package com.se77;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class LocalInterference {
	
	@Test
	public void interference() {
	
		// Creates a List<String>
		var myList = new ArrayList<String>();
		
		assertNotNull(myList);
		assertTrue( myList instanceof List);
		
		// Creates a List<Object>
		var myObjectList = new ArrayList<>();
		
		assertNotNull(myObjectList);
	
	}

}
