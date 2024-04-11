package packageTest;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import frgp.utn.edu.ar.entidad.Email;

class EmailTest {
	
	private String correo; 
	private Email email; 
	
	
	@BeforeEach
	public void beforeEachTest() {

	}
	
	@AfterEach
	public void afterEachTest() {
		
	}
	// Métodos de prueba para validar correo con letra mayúscula
	@Test
	public void testValidarCorreo_conLetraMayuscula_retornaTrue() {
		correo = "EjemPlo1@gmail.com"; 
		email = new Email(correo); 
		boolean res = Email.validarCorreo(email.toString());
		
		assertTrue(res); // Verifica que el resultado sea verdadero
	}
	
	@Test
	public void testValidarCorreo_sinLetraMayuscula_retornaFalse() {

	}
	
	
	// Métodos de prueba para validar correo con letra minúscula
	@Test
	public void testValidarCorreo_conLetraMinuscula_retornaTrue() {
		
	}
	
	@Test
	public void testValidarCorreo_sinLetraMinuscula_retornaFalse() {
		
	}
	
	@Test
	public void testValidarCorreo_alMenosUnNumero_retornaTrue() {
		correo = "EjemPlo1@gmail.com"; 
		email = new Email(correo); 
		boolean res = Email.validarCorreo(email.toString());
		assertTrue(res); 
	}
	@Test
	public void testValidarCorreo_alMenosUnNumero_retornaFalse() {
		correo = "EjemPlo@gmail.com"; 
		email = new Email(correo); 
		boolean res = Email.validarCorreo(email.toString());
		assertFalse(res); 
	}
	
	//Ocho digitos
	
    @Test
    public void testValidarCorreo_Al_Menos_8_Digitos_retortnaTrue() {
    	
    	correo = "12345678@correo.com"; 
		email = new Email(correo); 
		boolean res = Email.validarCorreo(email.toString());
		
		assertTrue(res); 
    }
    
    @Test
    public void testValidarCorreo_Al_Menos_8_Digitos_retortnaFalse() {
    	
    	correo = "1234567@correo.com"; 
		email = new Email(correo); 
		boolean res = Email.validarCorreo(email.toString());
		
		assertFalse(res); 
    }
    
    @Test
    public void testValidarCorreo_Mas_De_8_Digitos_retortnaTrue() {
    	
    	correo = "1234567891011@correo.com"; 
		email = new Email(correo); 
		boolean res = Email.validarCorreo(email.toString());
		
		assertTrue(res); 
    }
    
    @Test
    public void testValidarCorreo_Sin_Digitos_retortnaFalse() {
    	
    	correo = ""; 
		email = new Email(correo); 
		boolean res = Email.validarCorreo(email.toString());
		
		assertFalse(res); 
    }
    
}
