package co.com.pruebaM.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;

import org.omnifaces.util.Messages;

import co.com.pruebaM.dao.CiudadDao;
import co.com.pruebaM.dao.EstadoDao;
import co.com.pruebaM.dao.PersonaDao;
import co.com.pruebaM.entyties.Ciudad;
import co.com.pruebaM.entyties.Estado;
import co.com.pruebaM.entyties.Persona;

@SuppressWarnings("serial")
@ManagedBean
@ViewScoped
public class PersonaBean implements Serializable{

	private Persona persona;
	private Estado estado;
	private List<Persona> listaPersona;
	private List<Estado> listaEstado;
	private List<Ciudad> listaCiudad;

	@PostConstruct
	public void listar(){

		try {
			PersonaDao dao = new PersonaDao();
			listaPersona = dao.listar("nombre");
			CiudadDao daoC = new CiudadDao();
			listaCiudad = daoC.listar();
		} catch (RuntimeException ex) {
			Messages.addGlobalError("Error No se cargaron las ciudades");
			ex.printStackTrace();
		}
	}

	public void nuevo(){
		try {
			persona = new Persona();
			estado = new Estado();
			EstadoDao daoE = new EstadoDao();
			listaEstado = daoE.listar("nombre");
			
			listaCiudad = new ArrayList<Ciudad>();					
		} catch (RuntimeException ex) {
			Messages.addGlobalError("Error No se cargaron las ciudades");
			ex.printStackTrace();
		}

	}

	public void salvar(){

		try {
			PersonaDao dao = new PersonaDao();
			dao.merge(persona);
			
			listaPersona = dao.listar("nombre");
			nuevo();
			Messages.addGlobalInfo("Se salvo la Persona");
		} catch (RuntimeException ex) {
			Messages.addGlobalError("Error No se Salvo la persona");
			ex.printStackTrace();
		}

	}

	public void editar(ActionEvent evento){

		try {
			persona = (Persona) evento.getComponent().getAttributes().get("personaSelecionada");
			//System.out.println(persona.getCiudad().getEstado().getCodigo() + "CCCC");
			//estado = persona.getCiudad().getEstado();	
			EstadoDao daoE = new EstadoDao();			
			listaEstado = daoE.listar();
			CiudadDao daoC = new CiudadDao();
			listaCiudad = daoC.listar();
					
		} catch (RuntimeException ex) {
			Messages.addGlobalError("Error No se cargaron las ciudades");
			ex.printStackTrace();
		}
	}

	public void borrar(ActionEvent evento){

		try {
			persona = (Persona) evento.getComponent().getAttributes().get("personasSelecionada");
			PersonaDao dao = new PersonaDao();
			dao.borrar(persona);			
			listaPersona = dao.listar();			
			Messages.addGlobalInfo("Se elimino la Persona");	
		} catch (RuntimeException ex) {
			Messages.addGlobalError("Error No se borro la Persona");
			ex.printStackTrace();
		}
	}
	
	public void popular(){
		
		try {
			
			if(estado != null){
				//System.out.println("codigo :" + estado.getCodigo());
				CiudadDao dao = new CiudadDao();
				//listaCiudad = dao.buscarPorEstado(estado.getCodigo());
			}			
			else{
				listaCiudad = new ArrayList<Ciudad>();
			}
		} catch (RuntimeException ex) {
			Messages.addGlobalError("Error No se cargaron las ciudades");
			ex.printStackTrace();
		}
		
	}


	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	public List<Persona> getListaPersona() {
		return listaPersona;
	}
	public void setListaPersona(List<Persona> listaPersona) {
		this.listaPersona = listaPersona;
	}

	public List<Estado> getListaEstado() {
		return listaEstado;
	}

	public void setListaEstado(List<Estado> listaEstado) {
		this.listaEstado = listaEstado;
	}

	public List<Ciudad> getListaCiudad() {
		return listaCiudad;
	}

	public void setListaCiudad(List<Ciudad> listaCiudad) {
		this.listaCiudad = listaCiudad;
	}
	
	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}



}
