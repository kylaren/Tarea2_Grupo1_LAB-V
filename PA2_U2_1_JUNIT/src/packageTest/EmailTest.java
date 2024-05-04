package packageTest;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import frgp.utn.edu.ar.entidad.Email;

class EmailTest {
	
	// Método de prueba para validar correo que con letra mayúscula es valido
	@Test
	public void testValidarCorreo_conLetraMayuscula_retornaTrue() {
		
		assertTrue(Email.validarCorreo("EjemPlo1@gmail.com"));
	}
	
	// Metodo de prueba para validar correo que sin letra mayuscula es invalido
	@Test
	public void testValidarCorreo_sinLetraMayuscula_retornaFalse() {
		assertFalse(Email.validarCorreo("ejemplo1@gmail.com"));
	}
	
	/*** Ocho dígitos ***/
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
	public void testValidarCorreo_menosDe8Caracteres_retornaFalse() {
		String correoInvalido = "3G@g.es";
		assertFalse(Email.validarCorreo(correoInvalido));
	}
	
    @Test
    public void testValidarCorreo_Mas_8_Digitos_retornaTrue() {
    	
		assertTrue(Email.validarCorreo("Cero123456@correo.com")); 
    }   
         
    @Test
    public void testValidarCorreo_Vacio_retornaFalse() {   	
		
		assertFalse(Email.validarCorreo("")); 
    }
        
    @Test
    public void testValidarCorreo_8_Exactos_retornaTrue() {
    	
		assertTrue(Email.validarCorreo("1@Ab.com")); 
    }
    
    @Test
    public void testValidarCorreo_8_Exactos_retornaFalse() {
    	
		assertFalse(Email.validarCorreo("1@ab.com")); 
    }
	
	/*Tests al menos un numero */
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
    
    /*** Validar mail alfanumerico ***/
    @Test
    public void testValidarCorreo_un_caracter_alfanumerico_retornaTrue() {
        String correoValido = "Mail123@mail.com";
        assertTrue(Email.validarCorreo(correoValido));
    }
    
    @Test
    public void testValidarCorreo_un_caracter_alfanumerico_retornaFalse() {
        String correoInvalido = "Mail@mail.com";
        assertFalse(Email.validarCorreo(correoInvalido));
    }
    
    @Test
    public void testValidarCorreo_un_caracter_alfanumerico_minusculas_retornaFalse() {
        String correoInvalido = "mail123@mail.com";
        assertFalse(Email.validarCorreo(correoInvalido));
    }
    
    @Test
    public void testValidarCorreo_un_caracter_alfanumerico_mayusculas_retornaTrue() {
        String correoValido = "MAILl123@mail.com";
        assertTrue(Email.validarCorreo(correoValido));
    }  
    
    @Test
    public void testValidarCorreo_dos_arroba_retornaTrue() {
        String correoInvalido = "M@ill123@mail.com";
        assertTrue(Email.validarCorreo(correoInvalido));
    } 
}
