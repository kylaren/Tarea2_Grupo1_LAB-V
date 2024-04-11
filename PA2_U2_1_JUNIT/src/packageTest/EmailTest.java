package packageTest;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import frgp.utn.edu.ar.entidad.Email;

class EmailTest {
	
	
	// Métodos de prueba para validar correo con letra mayúscula
	@Test
	public void testValidarCorreo_conLetraMayuscula_retornaTrue() {
		/*correo = "EjemPlo1@gmail.com"; 
		email = new Email(correo); 
		boolean res = Email.validarCorreo(email.toString());		
		assertTrue(res);*/
		
		assertTrue(Email.validarCorreo("EjemPlo1@gmail.com"));
	}
	
	@Test
	public void testValidarCorreo_MasDeOchoDigitos_ConNumero_TodasMinusculas() {
		assertFalse(Email.validarCorreo("ejemplo2@gmail.com"));
	}
	
	@Test
	public void testValidarCorreo_MasDeOchoDigitos_ConNumero_TodasMayusculas() {
		assertFalse(Email.validarCorreo("EJEMPLO2@GMAIL.COM"));
	}
	
	@Test
	public void testValidarCorreo_MasDeOchoDigitos_SoloNumeros() {
		assertFalse(Email.validarCorreo("112233@6.0"));
	}
	
	@Test
	public void testValidarCorreo_MenosDeOchoDigitos_SoloMinusculas() {
		assertFalse(Email.validarCorreo("ej@mail"));
	}
	
	@Test
	public void testValidarCorreo_MenosDeOchoDigitos_SoloMatusculas() {
		assertFalse(Email.validarCorreo("EJ@MAIL"));
	}
	
	
	
	@Test
	public void testValidarCorreo_alMenosUnNumero_retornaTrue() {
		/*correo = "EjemPlo1@gmail.com"; 
		email = new Email(correo); 
		boolean res = Email.validarCorreo(email.toString());
		assertTrue(res); */
		assertTrue(Email.validarCorreo("EjemPlo1@gmail.com"));
	}
	
	@Test
	public void testValidarCorreo_alMenosUnNumero_retornaFalse() {
		/*correo = "EjemPlo@gmail.com"; 
		email = new Email(correo); 
		boolean res = Email.validarCorreo(email.toString());*/
		assertFalse(Email.validarCorreo("EjemPlo@gmail.com")); 
		
	}
	
	//Ocho digitos
	
    @Test
    public void testValidarCorreo_Al_Menos_8_Digitos_retornaTrue() {
    	
    	/*correo = "12345678@correo.com"; 
		email = new Email(correo); 
		boolean res = Email.validarCorreo(email.toString());*/
		
		assertTrue(Email.validarCorreo("12345678@correo.com")); 
    }
    
    
    @Test
    public void testValidarCorreo_Mas_De_8_Digitos_retornaTrue() {
    	
    	/*correo = "1234567891011@correo.com"; 
		email = new Email(correo); 
		boolean res = Email.validarCorreo(email.toString());*/
		
		assertTrue(Email.validarCorreo("1234567891011@correo.com")); 
    }
    
    @Test
    public void testValidarCorreo_Al_Menos_8_Digitos_retornaFalse() {
    	
    	/*correo = "1234567@correo.com"; 
		email = new Email(correo); 
		boolean res = Email.validarCorreo(email.toString());*/
    	
    	assertFalse(Email.validarCorreo("1234567@correo.com")); 
    }
    @Test
    public void testValidarCorreo_Sin_Digitos_retornaFalse() {
    	
    	/*correo = ""; 
		email = new Email(correo); 
		boolean res = Email.validarCorreo(email.toString());*/
		
		assertFalse(Email.validarCorreo("")); 
    }
    
}
