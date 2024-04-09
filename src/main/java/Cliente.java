import java.util.ArrayList;

public class Cliente {
	private String nombre;
	public ArrayList<Permiso> permisos = new ArrayList<Permiso>();

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void buscarPermiso() {
		throw new UnsupportedOperationException();
	}

	public void solicitarPermiso() {
		throw new UnsupportedOperationException();
	}

	public Cliente(String nombre) {
		throw new UnsupportedOperationException();
	}
}