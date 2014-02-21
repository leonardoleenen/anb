package bo.gob.aduanda.reglas.facts;

public class Canal {

	private String subpartida;
	private String destino;
	private String tipoDoc;
	private Documento nroDocumento;
	private Despachante despachante;
	private String modo_transporte;
	private String verificacion_documento;
	private String resultado;
	private int regla;

	public Canal() {
		super();
	}

	public Canal(String subpartida, String destino, String tipoDoc, String modo_transporte, String verificacion_documento, Documento nroDocumento, Despachante despachante) {
		super();
		this.subpartida = subpartida;
		this.destino = destino;
		this.tipoDoc = tipoDoc;
		this.nroDocumento = nroDocumento;
		this.despachante = despachante;
		this.modo_transporte = modo_transporte;
		this.verificacion_documento = verificacion_documento;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public int getRegla() {
		return regla;
	}

	public void setRegla(int regla) {
		this.regla = regla;
	}

	public String getSubpartida() {
		return subpartida;
	}

	public void setSubpartida(String subpartida) {
		this.subpartida = subpartida;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getTipoDoc() {
		return tipoDoc;
	}

	public void setTipoDoc(String tipoDoc) {
		this.tipoDoc = tipoDoc;
	}

	public Documento getNroDocumento() {
		return nroDocumento;
	}

	public void setNroDocumento(Documento nroDocumento) {
		this.nroDocumento = nroDocumento;
	}

	public Despachante getDespachante() {
		return despachante;
	}

	public void setDespachante(Despachante despachante) {
		this.despachante = despachante;
	}

	public String getModo_transporte() {
		return modo_transporte;
	}

	public void setModo_transporte(String modo_transporte) {
		this.modo_transporte = modo_transporte;
	}

	public String getVerificacion_documento() {
		return verificacion_documento;
	}

	public void setVerificacion_documento(String verificacion_documento) {
		this.verificacion_documento = verificacion_documento;
	}

}
