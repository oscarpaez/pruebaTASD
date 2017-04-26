package co.com.pruebaM.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.omnifaces.util.Messages;

import co.com.pruebaM.dao.ActivoDao;
import co.com.pruebaM.dao.AreaDao;
import co.com.pruebaM.dao.EstadoDao;
import co.com.pruebaM.dao.PersonaDao;
import co.com.pruebaM.dao.TipoDao;
import co.com.pruebaM.entyties.Activo;
import co.com.pruebaM.entyties.Area;
import co.com.pruebaM.entyties.Estado;
import co.com.pruebaM.entyties.Persona;
import co.com.pruebaM.entyties.Tipo;



@SuppressWarnings("serial")
@ManagedBean
@ViewScoped
public class ActivoBean implements Serializable{

	private List<Activo> listaActivo;
	private List<Activo> filtroActivo;
	private List<Area> listaArea;
	private List<Persona> listaPersona;
	private List<Estado> listaEstado;
	private List<Tipo> listaTipo;

	private Activo activo;


	@PostConstruct
	public void listar(){

		try {
			ActivoDao dao = new ActivoDao();
			listaActivo = dao.listar();

		} catch (RuntimeException ex) {
			ex.printStackTrace();			
		}
	}

	public void salvar(){

		try {
			ActivoDao dao = new ActivoDao();
			dao.salvar(activo);

			Messages.addGlobalInfo("Se salvo la Persona");
		} catch (RuntimeException ex) {
			Messages.addGlobalError("Error No se Salvo la persona");
			ex.printStackTrace();
		}

	}

	public void preparar(){

		try {
			activo = new Activo();

			AreaDao dao = new AreaDao();
			listaArea = dao.listar();

			PersonaDao  daoP = new PersonaDao();
			listaPersona = daoP.listar();

			EstadoDao daoE = new EstadoDao();
			listaEstado = daoE.listar();			

			TipoDao daoT = new TipoDao();
			listaTipo = daoT.listar();


			Messages.addGlobalInfo("Se salvo la Persona");
		} catch (RuntimeException ex) {
			Messages.addGlobalError("Error No se Salvo la persona");
			ex.printStackTrace();
		}

	}

	public void editar(Activo acti){

		try {
			listaArea = new ArrayList<>();
			listaPersona = new ArrayList<>();
			listaEstado = new ArrayList<>();
			listaTipo = new ArrayList<>();
			
			activo = acti;
			
			AreaDao dao = new AreaDao();
			listaArea = dao.listar();

			PersonaDao  daoP = new PersonaDao();
			listaPersona = daoP.listar();

			EstadoDao daoE = new EstadoDao();
			listaEstado = daoE.listar();			

			TipoDao daoT = new TipoDao();
			listaTipo = daoT.listar();
		} catch (RuntimeException ex) {
			Messages.addGlobalError("Error No se Salvo la persona");
			ex.printStackTrace();
		}
	}
	
	public void borrar(Activo acti){

		try {
			activo = acti; 
			ActivoDao dao = new ActivoDao();
			dao.borrar(activo);
			
			listar();
		} catch (RuntimeException e) {
			e.printStackTrace();
			Messages.addGlobalError("Error no se guardo el Proyecto");
		}
	}



	public List<Activo> getListaActivo() {
		return listaActivo;
	}

	public void setListaActivo(List<Activo> listaActivo) {
		this.listaActivo = listaActivo;
	}

	public List<Area> getListaArea() {
		return listaArea;
	}

	public void setListaArea(List<Area> listaArea) {
		this.listaArea = listaArea;
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

	public List<Tipo> getListaTipo() {
		return listaTipo;
	}

	public void setListaTipo(List<Tipo> listaTipo) {
		this.listaTipo = listaTipo;
	}

	public Activo getActivo() {
		return activo;
	}

	public void setActivo(Activo activo) {
		this.activo = activo;
	}

	public List<Activo> getFiltroActivo() {
		return filtroActivo;
	}

	public void setFiltroActivo(List<Activo> filtroActivo) {
		this.filtroActivo = filtroActivo;
	}
}
