package PruebaMod1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ClienteTest {

	@Test
	void test() {
		assertEquals("Test Exitoso", new PruebaMod1.Cliente(404505, "Test Exitoso", "En alg�n lugar", 125462).getRazonsocial());
		}
}