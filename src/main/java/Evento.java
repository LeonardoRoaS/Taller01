public class Evento extends Permiso {
	private String tipoEvento;
	private int nAsistentes;
	private String seguridad;

	public String getTipoEvento() {
		return this.tipoEvento;
	}

	public void setTipoEvento(String tipoEvento) {
		this.tipoEvento = tipoEvento;
	}

	public int getNAsistentes() {
		return this.nAsistentes;
	}

	public void setNAsistentes(int nAsistentes) {
		this.nAsistentes = nAsistentes;
	}

	public String getSeguridad() {
		return this.seguridad;
	}

	public void setSeguridad(String seguridad) {
		this.seguridad = seguridad;
	}

	public String getTipo() {
		throw new UnsupportedOperationException();
	}

	public Evento(String tipoEvento, int nAsistentes, String seguridad) {
		throw new UnsupportedOperationException();
	}

	public void costoEvento() {
		throw new UnsupportedOperationException();
	}

	public void mostrarDetallesPermiso() {
		throw new UnsupportedOperationException();
	}
}