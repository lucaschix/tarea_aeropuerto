import java.util.Date;

public class Pasaporte {

	private int ID;
	private String nacionalidad;
	private int num_hojas;
	private Date fechaExpiracion;

	public int getID() {
		// TODO - implement Pasaporte.getID
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param nacionalidad
	 */
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public int getNum_hojas() {
		return this.num_hojas;
	}

	/**
	 * 
	 * @param num_hojas
	 */
	public void setNum_hojas(int num_hojas) {
		this.num_hojas = num_hojas;
	}

	/**
	 * 
	 * @param ID
	 */
	public void setID(int ID) {
		// TODO - implement Pasaporte.setID
		throw new UnsupportedOperationException();
	}

	public String getNacionalidad() {
		return this.nacionalidad;
	}

	public Date getFechaExpiracion() {
		return this.fechaExpiracion;
	}

	/**
	 * 
	 * @param fechaExpiracion
	 */
	public void setFechaExpiracion(Date fechaExpiracion) {
		this.fechaExpiracion = fechaExpiracion;
	}

	public boolean esValido() {
		// TODO - implement Pasaporte.esValido
		throw new UnsupportedOperationException();
	}

	public Pasaporte(int ID, String nacionalidad, int num_hojas, Date fechaExpiracion) {
		this.ID = ID;
		this.nacionalidad = nacionalidad;
		this.num_hojas = num_hojas;
		this.fechaExpiracion = fechaExpiracion;
	}

}