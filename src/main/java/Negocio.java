public class Negocio extends Permiso {
	private double tamanioLocal;
	private int nEmpleados;
	private String tipoNegocio;

	public double getTamanioLocal() {
		return this.tamanioLocal;
	}

	public void setTamanioLocal(double tamanioLocal) {
		this.tamanioLocal = tamanioLocal;
	}

	public int getNEmpleados() {
		return this.nEmpleados;
	}

	public void setNEmpleados(int nEmpleados) {
		this.nEmpleados = nEmpleados;
	}

	public String getTipoNegocio() {
		return this.tipoNegocio;
	}

	public void setTipoNegocio(String tipoNegocio) {
		this.tipoNegocio = tipoNegocio;
	}

	public String getTipo() {
		throw new UnsupportedOperationException();
	}

	public void costoNegocio() {
		throw new UnsupportedOperationException();
	}

	public void mostrarDetallesPermiso() {
		throw new UnsupportedOperationException();
	}

	public Negocio(double tamanioLoca, int nEmpleados, String tipoNegocio) {
		throw new UnsupportedOperationException();
	}
}