import java.util.ArrayList;
import java.util.List;

public class Municipalidad {
	private ArrayList<Permiso> permisosRealizados;
	public ArrayList<Cliente> clientes = new ArrayList<Cliente>();


	public ArrayList<Permiso> getPermisosRealizados() {
		return permisosRealizados;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void registrarClientes(Cliente cliente) {
		this.clientes.add(cliente);
	}

	public void agregarPermisosRealizados(Permiso permiso, Cliente cliente){
		cliente.getPermisos().add(permiso);
		this.permisosRealizados.add(permiso);
	}

	public void mostrarPermisosRealizados(){

	}
}