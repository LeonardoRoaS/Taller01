import java.util.Date;

public abstract class Permiso {
	private int identificador;
	private Date fechaEmision;
	private Date fechaVencimiento;
	private double costo;
	public Cliente cliente;

	public abstract String getTipo();

	public abstract void mostrarDetallesPermiso();

	public Date getFechaEmision() {
		return this.fechaEmision;
	}

	public void setFechaEmision(Date fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	public Date getFechaVencimiento() {
		return this.fechaVencimiento;
	}

	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public double getCosto() {
		return this.costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public int getIdentificador() {
		return this.identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public Permiso(int identificador, Cliente cliente) {
		this.identificador = identificador;
		this.fechaEmision = new Date();
		this.fechaVencimiento = new Date(1000);
		this.costo = 1000;
		this.cliente = cliente;
	}
}