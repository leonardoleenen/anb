package bo.gob.aduana.operador.impl;

import bo.gob.aduana.core.domain.Operador;
import bo.gob.aduana.core.exceptions.BusinessException;
import bo.gob.aduana.core.exceptions.SecurityException;
import bo.gob.aduana.core.exceptions.TechnicalException;
import junit.framework.TestCase;

public class OperadoresTest extends TestCase {
	
	
	
	public void testNuevoOperadorNoValido() { 
		Services ser = new Services();
		Operador op = new Operador();
		
		op.setNit("12345");
		
		try {
			ser.nuevoOperador(op);
			assertEquals(true, false);
		} catch (BusinessException e) {
			assertEquals(true, true);
			
		} catch (TechnicalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		
	}
	
	
	
	public void testNuevoOperadorValido(){
		Operador opValido= new Operador();
		Operador opNoValido = new Operador();
		
		Services ser=new Services();
		
		opValido.setNit("2222");
		
		
		try {
			assertEquals(opValido, ser.nuevoOperador(opValido));
		} catch (BusinessException e) {
			assertEquals(true, false);
			e.printStackTrace();
		} catch (TechnicalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
