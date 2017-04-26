package co.com.pruebaM.entyties;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@SuppressWarnings("serial")
@Entity
public class Activo implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column (scale =100)
	private String nombre;
	
	@Column (scale =100)	
	private String descripcion;
	
	@Column (scale =100)
	private String Serial;

	private BigDecimal numero;
	
	@Column(scale = 2)
	private BigDecimal peso;
	
	@Column(scale = 2)
	private BigDecimal largo;
	
	@Column(scale = 2)
	private BigDecimal alto;
	
	@Column(scale = 2)
	private BigDecimal ancho;
	
	@Column(scale = 2)
	private BigDecimal valorCompra;
	
	@Temporal(TemporalType.DATE)
	private Date fechaCompra;
	
	@Temporal(TemporalType.DATE)
	private Date fechaBaja;
	
	@Column (scale =100)
	private String color;	
	
	@OneToOne
	private Estado estado;
	
	@OneToOne
	private Tipo tipo;
	
	@OneToOne
	private Area area;
	
	@OneToOne
	private Persona persona;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getSerial() {
		return Serial;
	}

	public void setSerial(String serial) {
		Serial = serial;
	}

	public BigDecimal getNumero() {
		return numero;
	}

	public void setNumero(BigDecimal numero) {
		this.numero = numero;
	}

	public BigDecimal getPeso() {
		return peso;
	}

	public void setPeso(BigDecimal peso) {
		this.peso = peso;
	}

	public BigDecimal getLargo() {
		return largo;
	}

	public void setLargo(BigDecimal largo) {
		this.largo = largo;
	}

	public BigDecimal getAlto() {
		return alto;
	}

	public void setAlto(BigDecimal alto) {
		this.alto = alto;
	}

	public BigDecimal getAncho() {
		return ancho;
	}

	public void setAncho(BigDecimal ancho) {
		this.ancho = ancho;
	}

	public BigDecimal getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(BigDecimal valorCompra) {
		this.valorCompra = valorCompra;
	}

	public Date getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(Date fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public Date getFechaBaja() {
		return fechaBaja;
	}

	public void setFechaBaja(Date fechaBaja) {
		this.fechaBaja = fechaBaja;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}
}
