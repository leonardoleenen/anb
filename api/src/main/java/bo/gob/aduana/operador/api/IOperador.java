package bo.gob.aduana.operador.api;


import java.util.List;

import bo.gob.aduana.core.domain.Operador;
import bo.gob.aduana.core.exceptions.BusinessException;
import bo.gob.aduana.core.exceptions.SecurityException;
import bo.gob.aduana.core.exceptions.TechnicalException;

public interface IOperador {
	
	public Operador nuevoOperador(Operador operador) throws BusinessException, TechnicalException ,SecurityException;
	
	public Operador consultarOperador(String nit) throws TechnicalException, SecurityException;
	
	public void aceptar(Operador operador) throws BusinessException, TechnicalException, SecurityException;
	
	public void rechazar(Operador operador) throws BusinessException, TechnicalException, SecurityException;
	
	public List<Operador> obtenerOperadoresNuevos() throws TechnicalException, SecurityException;

}
