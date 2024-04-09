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
		return "Negocio";
	}

	public void costoNegocio() {
		double costoBase = super.getCosto();
		double costoFinal = costoBase+(this.tamanioLocal*150000);
		System.out.println("Costo Permiso Negocio: "+costoFinal);
	}

	public void mostrarDetallesPermiso() {
		String detallePermiso = "Cliente :"+ super.cliente.getNombre()+", Tipo Permiso: "+this.getTipo()+", Fecha emision: "+super.getFechaEmision()+", Fecha Vencimiento: "+super.getFechaVencimiento()+", Costo: "this.costoNegocio();
	}

	public Negocio(int identificador, double tamanioLocal, int nEmpleados, String tipoNegocio, Cliente cliente) {
		super(identificador,cliente);
		this.tamanioLocal = tamanioLocal;
		this.nEmpleados = nEmpleados;
		this.tipoNegocio = tipoNegocio;
	}
}