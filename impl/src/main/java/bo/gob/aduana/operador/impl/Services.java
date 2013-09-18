package bo.gob.aduana.operador.impl;

import java.util.List;

import bo.gob.aduana.core.domain.Operador;
import bo.gob.aduana.core.exceptions.BusinessException;
import bo.gob.aduana.core.exceptions.SecurityException;
import bo.gob.aduana.core.exceptions.TechnicalException;
import bo.gob.aduana.operador.api.IOperador;

public class Services implements IOperador {

	public Operador nuevoOperador(Operador operador) throws BusinessException,
			TechnicalException, SecurityException {
		

		if (operador.getNit().equals("00000")){
			throw new BusinessException("El NIT es invalido");
		}
		
		if (operador.getNit().equals("2222"))
			return operador;
			
			
		return null;
		
		
		
	}

	public Operador consultarOperador(String nit) throws TechnicalException,
			SecurityException {
		// TODO Auto-generated method stub
		return null;
	}

	public void aceptar(Operador operador) throws BusinessException,
			TechnicalException, SecurityException {
		// TODO Auto-generated method stub

	}

	public void rechazar(Operador operador) throws BusinessException,
			TechnicalException, SecurityException {
		// TODO Auto-generated method stub

	}

	public List<Operador> obtenerOperadoresNuevos() throws TechnicalException,
			SecurityException {
		// TODO Auto-generated method stub
		return null;
	}

}
