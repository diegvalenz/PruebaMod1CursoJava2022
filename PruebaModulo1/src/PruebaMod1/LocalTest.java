package PruebaMod1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LocalTest {

	
	@Test 
	void test2() {
	assertEquals("Test Fallido", new PruebaMod1.Local("Efectivamente es un Test Fallido", 123456).getNombrelocal());
	}

}
