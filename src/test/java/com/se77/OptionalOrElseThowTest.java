package com.se77;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.NoSuchElementException;
import java.util.Optional;

import org.junit.jupiter.api.Test;

public class OptionalOrElseThowTest {
	
	@Test
	public void createOptionalElseThrowTest() {
		
		var opt = Optional.<String>ofNullable(null);
		
		assertThrows(NoSuchElementException.class, () -> opt.orElseThrow() );
	}

}
