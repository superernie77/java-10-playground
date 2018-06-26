package com.se77;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

public class UnmodifiableCollectionTest {
	
	@Test
	public void createUnmodifiableCollections() {
		  var list = new ArrayList<>();
	      list.add(1);
	      list.add(2);
	      
	      var copy = List.copyOf(list);
	      
	      assertThrows(UnsupportedOperationException.class, () -> copy.add(3)  );
	}
	
	@Test
	public void createUnmodifiableCollector() {
		  var list = new ArrayList<>();
	      list.add(1);
	      list.add(2);
	      
	      var copy =  list.stream().collect(Collectors.toUnmodifiableList());
	      
	      assertThrows(UnsupportedOperationException.class, () -> copy.add(3)  );
	}

}
