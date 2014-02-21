package bo.gob.aduanda.reglas.facts;

public class Documento {

	private int contravenciones;
	private int delitos;
	private int pendientes;
	private int anuladas;
	private boolean primerizo;
	private String riesgo;

	public Documento() {
		super();
	}

	public Documento(int contravenciones, int delitos, int pendientes, int anuladas, boolean primerizo) {
		super();
		this.contravenciones = contravenciones;
		this.delitos = delitos;
		this.pendientes = pendientes;
		this.anuladas = anuladas;
		this.primerizo = primerizo;
	}

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

	public boolean isPrimerizo() {
		return primerizo;
	}

	public void setPrimerizo(boolean primerizo) {
		this.primerizo = primerizo;
	}

	public String getRiesgo() {
		return riesgo;
	}

	public void setRiesgo(String riesgo) {
		this.riesgo = riesgo;
	}
}
