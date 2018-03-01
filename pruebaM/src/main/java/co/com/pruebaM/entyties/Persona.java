package co.com.pruebaM.entyties;

import java.io.Serializable;

import javax.persistence.*;


/**
 * The persistent class for the Persona database table.
 * 
 */
@SuppressWarnings("serial")
@Entity
public class Persona implements Serializable {
	

	@Id
	private Long cedula;
	
	@Column(length=50)
	private String nombre;
	
	@ManyToOne
	@JoinColumn(nullable = false)	
	private Ciudad ciudad;
	

	public Long getCedula() {
		return cedula;
	}

	public void setCedula(Long cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}	
}