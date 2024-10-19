import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Aeropuerto {

	private String nombre;
	private String ubicacion;
	private List<Avion> aviones;



	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return this.ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public void gestionarAviones() {
		// TODO - implement Aeropuerto.gestionarAviones
		throw new UnsupportedOperationException();
	}

	public void buscarUsuariosPorFecha(Date fecha) {
		// TODO - implement Aeropuerto.buscarUsuariosPorFecha
		throw new UnsupportedOperationException();
	}
	public void buscarUsuariosPorVuelo(String idVuelo) {
		// TODO - implement Aeropuerto.buscarUsuariosPorVuelo
		throw new UnsupportedOperationException();
	}

	public Aeropuerto(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.aviones = new ArrayList<>();


}
	public void agregarAvion(Avion avion){
		aviones.add(avion);
		System.out.println("Avion ");
	}
}