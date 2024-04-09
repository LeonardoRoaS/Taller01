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
		return "Construccion";
	}

	public void costoConstruccion() {
		throw new UnsupportedOperationException();
	}

	public void mostrarDetallesPermiso() {
		String detallePermiso = "Cliente :"+ super.cliente.getNombre()+", Tipo Permiso: "+this.getTipo()+", Fecha emision: "+super.getFechaEmision()+", Fecha Vencimiento: "+super.getFechaVencimiento()+", Costo: "this.costoConstruccion();
	}

	public Construccion(int identificador, double nMetrosCuadrados, String ubicacion, String tipoConstruccion, Cliente cliente) {
		super(identificador, cliente);
		this.nMetrosCuadrados = nMetrosCuadrados;
		this.ubicacion = ubicacion;
		this.tipoConstruccion = tipoConstruccion;
	}
}