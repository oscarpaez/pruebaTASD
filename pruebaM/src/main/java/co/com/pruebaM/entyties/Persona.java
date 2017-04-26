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
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long cedula;
	
	@Column(length=50)
	private String nombre;
	

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
	
}