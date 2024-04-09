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
		return "Evento";
	}

	public Evento(int identificador, String tipoEvento, int nAsistentes, String seguridad, Cliente cliente) {
		super(identificador, cliente);
		this.tipoEvento = tipoEvento;
		this.nAsistentes = nAsistentes;
		this.seguridad = seguridad;
	}

	public double costoEvento() {
		double costoBase = super.getCosto();
		double costoFinal = costoBase+((this.nAsistentes/100)*100000);
		return costoFinal;
	}

	public void mostrarDetallesPermiso() {
		String detallePermiso = "Cliente :"+ super.cliente.getNombre()+", Tipo Permiso: "+this.getTipo()+", Fecha emision: "+super.getFechaEmision()+", Fecha Vencimiento: "+super.getFechaVencimiento()+", Costo: "+this.costoEvento();
		System.out.println(detallePermiso);;
	}
}