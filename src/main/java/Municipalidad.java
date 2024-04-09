import java.util.ArrayList;
import java.util.List;

public class Municipalidad {
	private ArrayList<Permiso> permisosRealizados = new ArrayList<Permiso>();
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

	public void buscarPermiso(String tipoPermiso){
		for (Permiso permiso : this.permisosRealizados){
			if (permiso.getTipo().equalsIgnoreCase(tipoPermiso)){
				permiso.mostrarDetallesPermiso();
			}
		}
	}

	public Cliente buscarCliente(String nombre){
		//Buscar cliente por nombre y regresar el Cliente
		for (Cliente cliente : this.clientes){
			if (cliente.getNombre().equalsIgnoreCase(nombre)){
				return cliente;
			}
		}
		return null;
	}
}