import java.util.ArrayList;

public class Cliente {
	private String nombre;
	public ArrayList<Permiso> permisos = new ArrayList<Permiso>();

	public ArrayList<Permiso> getPermisos() {
		return permisos;
	}

	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public Cliente(String nombre) {
		this.nombre = nombre;
	}
}