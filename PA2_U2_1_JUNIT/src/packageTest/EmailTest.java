package packageTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import frgp.utn.edu.ar.entidad.Email;

class EmailTest {

	// M�todos de prueba para validar correo con letra may�scula
	@Test
	public void testValidarCorreo_conLetraMayuscula_retornaTrue() {
		
		String correo = "ejemPlo@gmail.com"; // Ejemplo
		Email email = new Email(correo); 
		
		boolean res = Email.validarCorreo(email.toString());
		
		assertTrue(res); // Verifica que el resultado sea verdadero
	}
	
	@Test
	public void testValidarCorreo_sinLetraMayuscula_retornaFalse() {
		
	}
	
	
	// M�todos de prueba para validar correo con letra min�scula
	@Test
	public void testValidarCorreo_conLetraMinuscula_retornaTrue() {
		
	}
	
	@Test
	public void testValidarCorreo_sinLetraMinuscula_retornaFalse() {
		
	}
}
