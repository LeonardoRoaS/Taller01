public class Main {
    public static void main(String[] args) {

        Municipalidad muni = new Municipalidad();
        muni.registrarClientes(new Cliente("Leonardo"));

        Negocio negocio1 = new Negocio(1,20, 10, "Negocio", muni.buscarCliente("Leonardo"));
        Evento evento1 = new Evento(1, "Evento",40000,"seguridad",muni.buscarCliente("Leonardo"));


        muni.agregarPermisosRealizados(negocio1,muni.buscarCliente("Leonardo"));
        muni.agregarPermisosRealizados(evento1, muni.buscarCliente("Leonardo"));
        muni.buscarPermiso("Negocio");

    }
}
