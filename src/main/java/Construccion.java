public class Construccion extends Permiso {
	private double nMetrosCuadrados;
	private String ubicacion;
	private String tipoConstruccion;

	public double getNMetrosCuadrados() {
		return this.nMetrosCuadrados;
	}

	public void setNMetrosCuadrados(double nMetrosCuadrados) {
		this.nMetrosCuadrados = nMetrosCuadrados;
	}

	public String getUbicacion() {
		return this.ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getTipoConstruccion() {
		return this.tipoConstruccion;
	}

	public void setTipoConstruccion(String tipoConstruccion) {
		this.tipoConstruccion = tipoConstruccion;
	}

	public String getTipo() {
		throw new UnsupportedOperationException();
	}

	public void costoConstruccion() {
		throw new UnsupportedOperationException();
	}

	public void mostrarDetallesPermiso() {
		throw new UnsupportedOperationException();
	}

	public Construccion(double nMetrosCuadrados, String ubicacion, String tipoConstruccion) {
		throw new UnsupportedOperationException();
	}
}