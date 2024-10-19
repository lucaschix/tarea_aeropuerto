import java.util.List;

public class Avion {

	private int id;
	private int capacidad;
	private List<Vuelo> vuelos;
	private int attribute;

	public int getId() {
		return this.id;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	public int getCapacidad() {
		return this.capacidad;
	}

	/**
	 * 
	 * @param capacidad
	 */
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public List<Vuelo> getVuelos() {
		return this.vuelos;
	}

	/**
	 * 
	 * @param vuelos
	 */
	public void setVuelos(List<Vuelo> vuelos) {
		this.vuelos = vuelos;
	}

	/**
	 * 
	 * @param vuelo
	 */
	public void registrarVuelo(Vuelo vuelo) {
		// TODO - implement Avion.registrarVuelo
		throw new UnsupportedOperationException();
	}

	public Avion() {
		// TODO - implement Avion.Avion
		throw new UnsupportedOperationException();
	}

}