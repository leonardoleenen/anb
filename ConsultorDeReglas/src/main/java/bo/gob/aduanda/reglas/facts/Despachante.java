package bo.gob.aduanda.reglas.facts;

public class Despachante {

	private static final String RIESGO_INDETERMINADO = "INDETERMINADO";
	private int contravenciones;
	private int delitos;
	private int pendientes;
	private int anuladas;
	private int modificadas;
	private double riesgo_calculado;

	public Despachante() {
		super();
	}

	public Despachante(int contravenciones, int delitos, int pendientes, int anuladas, int modificadas) {
		super();
		this.contravenciones = contravenciones;
		this.delitos = delitos;
		this.pendientes = pendientes;
		this.anuladas = anuladas;
		this.modificadas = modificadas;
		this.riesgo = RIESGO_INDETERMINADO;
	}

	public double getRiesgo_calculado() {
		return riesgo_calculado;
	}

	public void setRiesgo_calculado(double riesgo_calculado) {
		this.riesgo_calculado = riesgo_calculado;
	}

	public int getModificadas() {
		return modificadas;
	}

	public void setModificadas(int modificadas) {
		this.modificadas = modificadas;
	}

	private String riesgo;

	public int getContravenciones() {
		return contravenciones;
	}

	public void setContravenciones(int contravenciones) {
		this.contravenciones = contravenciones;
	}

	public int getDelitos() {
		return delitos;
	}

	public void setDelitos(int delitos) {
		this.delitos = delitos;
	}

	public int getPendientes() {
		return pendientes;
	}

	public void setPendientes(int pendientes) {
		this.pendientes = pendientes;
	}

	public int getAnuladas() {
		return anuladas;
	}

	public void setAnuladas(int anuladas) {
		this.anuladas = anuladas;
	}

	public String getRiesgo() {
		return riesgo;
	}

	public void setRiesgo(String riesgo) {
		this.riesgo = riesgo;
	}

}
