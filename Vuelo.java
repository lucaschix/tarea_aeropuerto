import java.util.Date;
import java.util.List;

public class Vuelo {

	private String id;
	private String origen;
	private String destino;
	private Date fecha;
	private List<Pasajeros> pasajeros;

	public String getId() {
		return this.id;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(String id) {
		this.id = id;
	}

	public String getOrigen() {
		return this.origen;
	}

	/**
	 * 
	 * @param origen
	 */
	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return this.destino;
	}

	/**
	 * 
	 * @param destino
	 */
	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Date getFecha() {
		return this.fecha;
	}

	/**
	 * 
	 * @param fecha
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public List<Pasajeros> getPasajeros() {
		return this.pasajeros;
	}

	/**
	 * 
	 * @param pasajeros
	 */
	public void setPasajeros(List<Pasajeros> pasajeros) {
		this.pasajeros = pasajeros;
	}

	/**
	 * 
	 * @param pasajero
	 */
	public void agregarPasajero(Pasajeros pasajero) {
		// TODO - implement Vuelo.agregarPasajero
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param pasajero
	 */
	public void validarPasaporte(Pasajeros pasajero) {
		// TODO - implement Vuelo.validarPasaporte
		throw new UnsupportedOperationException();
	}

	public Vuelo() {
		// TODO - implement Vuelo.Vuelo
		throw new UnsupportedOperationException();
	}

}